package com.labs.lab4;

        import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.time.LocalDateTime;

        public class Lab4 {

        public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        Order[] orders = new Order[10];

        orders[0] = new Order("Круасан курка і сир", "Зелена 156", 338, 2, true, LocalDateTime.now());
        orders[1] = new Order("Піцца 'Маргарита'", "Виговського 75", 150, 1, true, LocalDateTime.now());
        orders[2] = new Order("Стейк з говядини", "Сахарова 34", 100, 1, LocalDateTime.now());
        orders[3] = new Order("Салат 'Грецький'", "Литовська 26", 59, 6, LocalDateTime.now());
        orders[4] = new Order("Фіш енд Чіпс", "Патона 104", 120, 2, LocalDateTime.now());
        orders[5] = new Order("Піцца 'Кальцоне'", "Шота Руставелі 12", 40, 1, LocalDateTime.now());
        orders[6] = new Order("Форель на грилі", "Газова 7", 21, 1, LocalDateTime.now());
        orders[7] = new Order("Паста 'Болоньєзе'", "Хімічна 27", 15, 1, true, LocalDateTime.now());
        orders[8] = new Order("Суші Сет Каліфорнія", "Черешнева 3", 15, 1, LocalDateTime.now());
        orders[9] = new Order("Грибний Крем суп", "Дністерська 15", 15, 1, LocalDateTime.now());

        // Оплачені замовлення
        System.out.println("Оплачені замовлення:");
        for (Order order : orders) {
        if (order.isPaid()) {
        System.out.println(order.getInfo());
          }
        }

        // Неоплачені замовлення
        System.out.println();
        System.out.println("Неоплачені замовлення:");
        for (Order order : orders) {
        if (!order.isPaid()) {
        System.out.println(order.getInfo());
          }
        }
        System.out.println();

        // Пошук за адресою
        System.out.print("Введіть частину назви вулиці: ");
        String street = input.readLine();
        for (Order order : orders) {
        if (order.checkAddress(street)) {
        System.out.println(order.getInfo());
              }
          }
      }
  }
