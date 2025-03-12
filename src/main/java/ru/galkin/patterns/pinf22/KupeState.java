package ru.galkin.patterns.pinf22;

public enum KupeState {
    FULL{
        @Override
        public String toString() {
            return "Свободных мест нет";
        }
    },
    NO_FULL{
        @Override
        public String toString() {
            return "Еще есть свободные места";
        }
    }
}
