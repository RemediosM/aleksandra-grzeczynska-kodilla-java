package com.kodilla.good.patterns.challenges;

public class MailSender implements InformationService {

    @Override
    public void sendMail(User user) {

        System.out.println("E-mail to " + user.getSurname() + " " + user.getName());
    }
}
