public class Car {
    private String name;
    private int moving;
    private Number randomStandard = new Number(4);
    private Number maxNameLength = new Number(5);

    public Car(String name) {
        if (name.length() > this.maxNameLength.getValue()) {
            throw new IllegalArgumentException("자동차 이름은 5글자 이하만 가능합니다.");
        }
        this.name = name;
        this.moving = 0;
    }

    public void goAhead() {
        if (isGoCarAhead()) {
            this.moving++;
        }
    }

    public int getMoving() {
        return this.moving;
    }

    public String getName() {
        return this.name;
    }

    public String printMoving() {
        String movingString = "";
        for (int i = 0; i < this.moving; i++) {
            movingString += "-";
        }
        return this.name + " : " + movingString;
    }

    private boolean isGoCarAhead() {
        Integer randomValue = NumberUtils.getRandom();
        if (randomValue >= this.randomStandard.getValue()) {
            return true;
        }
        return false;
    }
}
