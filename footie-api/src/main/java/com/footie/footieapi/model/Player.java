package com.footie.footieapi.model;

import javax.persistence.*;

@Entity
@Table(name = "players")
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long id;

    @ManyToOne()
    public BasePlayer basePlayer;

    @Column(name = "headshot_img_url")
    public String headshotImgUrl;

    public double multiplier;

    public String position;

    public String role;

    @Column(name="current_level")
    public int currentLevel;

    @Column(name="max_level")
    public int maxLevel;

    public boolean tradeable;

    @Column(name="team_status")
    public String teamStatus;

    @Column(name = "in_in_squad_builder")
    public boolean inInSquadBuilder;

    @ManyToOne()
    public User user;

    public Player(){}

}
