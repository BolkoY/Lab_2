package lab_2;

    import javax.swing.*;

public class Lab_2 {

    public static void main(String[] args) {
        // Конструируем экземпляр фрейма
        Formula frame = new Formula();
        // Задаѐм реакцию на нажатие кнопки закрытия фрейма
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Показываем фрейм на экране
        frame.setVisible(true);
    }

}


