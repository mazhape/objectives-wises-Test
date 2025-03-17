package workingWith.JavaBasics;

class Elliptical{
    public int radiusA, radiusB;
    public int sum = 100;

    public void setRadius(int r){
        if(r>99) throw new IllegalArgumentException();
        radiusA = r;
        radiusB = sum - radiusA;

    }
}

//His goal cannot be accomplished.

//class Elliptical {
//    public int radiusA;
//    private int sum = 200; // Updated sum to 200
//
//    // Getter for radiusB, which is now calculated dynamically
//    public int getRadiusB() {
//        return sum - radiusA;
//    }
//
//    public void setRadius(int r) {
//        if (r > 199) throw new IllegalArgumentException(); // Updated condition
//        radiusA = r;
//    }
//}