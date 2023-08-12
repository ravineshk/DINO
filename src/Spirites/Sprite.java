package Spirites;

import GameConstant.GameConstant;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Sprite implements GameConstant {
    protected int x;
    protected int y;
    protected int w;
    protected int h;

    protected int speed;
    protected BufferedImage image;

    protected int force;
    protected boolean isJump ;
    protected boolean isCollide;
    protected int health ;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public boolean isCollide() {
        return isCollide;
    }

    public void setCollide(boolean collide) {
        isCollide = collide;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Sprite() {
        health = MAX_HEALTH;
    }
public void printPlayer(Graphics pen){
    pen.drawImage(default(),x,y,w,h,null);
}
}
