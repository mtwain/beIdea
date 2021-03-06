package org.besqueet.mtwain.beidea.controllers;

import android.content.Context;

import org.besqueet.mtwain.beidea.ui.Idea;
import io.realm.Realm;
import io.realm.RealmResults;


public class RealmController {

    static Realm realm;
    static RealmResults<Idea>ideas;

    public static void initRealm(Context context){
        realm = Realm.getInstance(context);
    }

    public static void addIdea(String idea,String title,int month,int year,int day,int dayOfWeek,String time,long timeInMill,String images){
        realm.beginTransaction();
        Idea ideaObject = realm.createObject(Idea.class); // Create a new object
        ideaObject.setIdea(idea);
        ideaObject.setTitle(title);
        ideaObject.setMonth(month);
        ideaObject.setYear(year);
        ideaObject.setDay(day);
        ideaObject.setDayOfWeek(dayOfWeek);
        ideaObject.setTime(time);
        ideaObject.setTimeInMill(timeInMill);
        ideaObject.setImages(images);
        realm.commitTransaction();
    }

    public static String getPath(Context context){
        Realm newRealm = Realm.getInstance(context);
        return newRealm.getPath();
    }


    public static  void deleteIdea(Idea idea){
        realm.beginTransaction();
        idea.removeFromRealm();
        realm.commitTransaction();
    }

    public static RealmResults<Idea> loadIdeas(){
        ideas = realm.where(Idea.class)
                .findAll();
        return ideas;
    }

    public static RealmResults<Idea> getIdeas(){
        return ideas;
    }
}
