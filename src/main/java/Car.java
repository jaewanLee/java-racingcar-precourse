public class Car {
    private String name;
    private int moving;

    private Number maxNameLength = new Number(5);

    public Car(String name) {
        if (name.length() > this.maxNameLength.getValue()) {
            throw new IllegalArgumentException("자동차 이름은 5글자 이하만 가능합니다.");
        }
        this.name = name;
        this.moving = 0;
    }


}