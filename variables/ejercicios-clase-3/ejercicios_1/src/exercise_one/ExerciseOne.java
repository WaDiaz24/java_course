package exercise_one;
/*
Operaciones, orden de prioridad estandar
1. Parentesis
2. division y multiplicación misma prioridad, se resuelve de izquierda a derecha
 */
public class ExerciseOne {
    public static void main(String[] args) {
        var result = 6 / 2*(1+2);
        var result2 = 6 /(2*(1+2));
        System.out.println(result);
        System.out.println(result2);

    }
}



