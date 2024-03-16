package org.example;

import proxy.BanqueService;
import proxy.BanqueWS;
import proxy.Compte;

import java.util.List;

public class ClientWS {
    public static void main(String[] args) {
        BanqueService proxy = new BanqueWS().getBanqueServicePort();
        System.out.println("Q1");
        System.out.println("---------------------------------------------");
        System.out.println(proxy.conversionMontantEuroToDH(1000));
        System.out.println("Q2");
        System.out.println("---------------------------------------------");
        Compte c1 = proxy.getCompteDetails(4);
        System.out.println("Code est : "+ c1.getCode());
        System.out.println("Le solde est :" + c1.getSolde());
        System.out.println("La date de creation est : " +c1.getDateCreation());

        System.out.println("Q3");
        System.out.println("---------------------------------------------");
        List<Compte> compList = proxy.listCpts();
        for (Compte c: compList){
            System.out.println("--------------------------------------------");
            System.out.println("Code est : "+ c.getCode());
            System.out.println("Le solde est :" + c.getSolde());
            System.out.println("La date de creation est : " +c.getDateCreation());
        }



        }
    }

