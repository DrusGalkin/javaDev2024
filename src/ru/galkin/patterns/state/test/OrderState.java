package ru.galkin.patterns.state.test;

public enum OrderState implements CheckState {
    REGISTERED(){
        @Override
        public OrderState check(Order order) {
            System.out.println("Товар оплачен! Скоро отправим.");
            order.setOrderState(this);
            return FROM;
        }
    },
    NOT_REGISTERED(){
        @Override
        public OrderState check(Order order) {
            System.out.println("Товар не оплачен!");
            order.setOrderState(this);
            return null;
        }
    },
    FROM(){
        @Override
        public OrderState check(Order order) {
            System.out.println("Находится в городе " + order.getFrom());
            order.setOrderState(this);
            return WHERE;
        }
    },
    WHERE(){
        @Override
        public OrderState check(Order order) {
            System.out.println("Находится в пункте назначения " + order.getWhere());
            order.setOrderState(this);
            return NOT_REGISTERED;
        }
    };
}
