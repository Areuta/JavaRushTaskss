package com.javarush.task.task13.task1328;

public abstract class AbstractRobot implements Attackable, Defensable{
    private static int hitCount;

    public BodyPart attack() {
        BodyPart attackedBodyPart = null;
        hitCount = (int) (4* Math.random());

        switch (hitCount) {
            case 1: {
                attackedBodyPart = BodyPart.ARM;
                break;
            }
            case 2: {
                attackedBodyPart = BodyPart.HEAD;
                break;
            }
            case 3: {
                attackedBodyPart = BodyPart.LEG;
                break;
            }
            case 0: {
                attackedBodyPart = BodyPart.CHEST;
                break;
            }
        }

        return attackedBodyPart;
    }

    public BodyPart defense() {
        BodyPart defencedBodyPart = null;
        hitCount = (int) (4* Math.random());

        switch (hitCount) {
            case 1: {
                defencedBodyPart = BodyPart.HEAD;
                break;
            }
            case 2: {
                defencedBodyPart = BodyPart.LEG;
                break;
            }
            case 3: {
                defencedBodyPart = BodyPart.CHEST;
                break;
            }
            case 0: {
                defencedBodyPart = BodyPart.ARM;
                break;
            }
        }

        return defencedBodyPart;
    }

    public abstract String getName();
}
