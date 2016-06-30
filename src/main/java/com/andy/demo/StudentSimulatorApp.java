package com.andy.demo;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;

/**
 * Created by yiming on 16/6/30.
 */
public class StudentSimulatorApp {

    private ActorSystem actorSystem = ActorSystem.create("UniversityActorSystem");
    private ActorRef teacherActorRef = actorSystem.actorOf(Props.create(TeacherActor.class), "teacherActorRef");

    public static void main(String[] args) {

    }

}
