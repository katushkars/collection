import java.util.Objects;

public class Task {
    private int number1;
    private int number2;

    public Task(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return (number1 == task.number1 && number2 == task.number2)||(number1==task.number2 && number2== task.number1);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number1, number2);
    }

    @Override
    public String toString() {
        return "Задача" +
                 + number1 +
                "*" + number2 +"=?"
                ;
    }
}
