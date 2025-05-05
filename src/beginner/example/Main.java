package beginner.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // " " <- 공백으로 구분된 문자열을 받아서 숫자, 사칙연산, 숫자, 사칙연산의 반복
        // 입력 예시: 1 + 2 - 3 * 4 / 5
        // 실제 수학적인 원리를 무시하고 앞에서부터 순서대로 계산을 한다.

        int result = 0;
        String input = getInput();
        String[] tokens = splitString(input);
        result = Integer.parseInt(tokens[0]);
        String operator = tokens[1];

        for (int i = 2; i < tokens.length; i++) {
            if (i % 2 == 0) {
                result = operate(operator, result, tokens, i);
            } else {
                operator = tokens[i];
            }
        }
        printResult(result);


        // 오브젝트 - 책

        // 책임
        // 1. 사용자와 상호작용 한다.
        // 2. 문자열을 공백으로 나눈다.
        // 3. 숫자를 계산한다.
        // 4. 계산된 결과를 출력한다.

        // 역할

        // 협력

        // Person implements Mentor, Mentee
        // name = 박경태
        // age = M 살

//        class MentorAndMentee {
//            Mentor mentor;
//            Mentee mentee;
//        }

        class Mentor {

        }

        class Mentee {

        }

/*        Metor metor = new Mentor();
        metor.doMentroring(List.of(Mentee));*/

/*
        public void doMentoring(){

        };

        public void receiveMentoring(){

        };
*/



        // 멘토 (interface)
        // mentoring ();
        // 최소 조건 - 현직자여야하고, 연차가 N년 이상이어야 한다.

        // 멘티

        // 마트
        // 역할
        // 책임
        // 물건 값을 계산한다.
        // 역할
        // Cashier -- Owner
        // public long purchase(long price, long payment) {
        // 물건 진열
        // 역할
        // Owner
        // public void displayItem(Item item) {
        // 재고 관리
        // 역할
        // Owner
        // public void manageStock(Item item) {
        // 물건 발주
        // 역할
        // Owner
        // public void orderItem(Item item) {

        // 물건을 장바구니에 담는다.
        // 역할
        // Customer
        // public void addToCart(Item item) {
        // 물건을 계산원에게 전달한다.
        // 역할
        // Cashier
        // public void checkout(Cart cart) {
        // 물건의 값을 지불한다
        // 역할
        // Cashier
        // public long purchase(long price, long payment) {
        // 계산이 끝난 후 영수증과 물건을 받는다.
        // 역할
        // Cashier
        // public Receipt issueReceipt(Cart cart) {

        // 역할을 정리
        // 1. 물건을 계산하는 사람
        // public long purchase(long price, long payment) {
        // 물건을 진열하는 사람
        // Owner implements Cashier
        // public void displayItem(Item item) {
        // 물건을 발주하는 사람
        // Owner
        // public void orderItem(Item item) {


        // 1. 계산원 (객체) -- 키오스크
        // Cashier
        // Person
        // Employee
        // 계산을 하고 영수증을 준다.
        // 현금 / 카드 / 상품권
        // 환불
        // 2. 물건을 진열할 사람
        // 물건 진열
        // 재고 관리
        // 물건 발주
        // 3. 물건을 사는 사람
        // 물건을 장바구니에 담는다.
        // 물건을 계산원에게 전달한다.
        // 물건의 값을 지불한다
        // 계산이 끝난 후 영수증과 물건을 받는다.
        // 4. 관리자 (점장, 매니저)
        // 직원 관리
        // 컴플레인 처리
        // 매출 관리

/*        Person implements Mentor, Manager {
            // 멘토링을 한다.
            @Override
            public void doMentoring() {
                System.out.println("멘토링을 합니다.");
            }

            // 관리한다.
            @Override
            public void manage() {
                System.out.println("관리를 합니다.");
            }
        }*/


        // Person implements Mentor, Manager

        // GPT(LLM) implements Mentor


/*        interface Mentor {
            doMentoring();
        }

        interface Manager {
            manage();
        }*/

        // SOLID 원칙 객체지향 5 원칙
        // 1. Single Responsibility Principle: 객체는 하나의 책임만 가져야 한다.
        // 2. Open/Closed Principle: 소스코드는 확장에 열려 있어야 하고, 수정에는 닫혀 있어야 한다.
        // 3. Liskov Substitution Principle: 자식 클래스는 언제나 부모 클래스를 대체할 수 있어야 한다.
        // 4. Interface Segregation Principle: 특정 클라이언트를 위한 인터페이스 여러 개가 범용 인터페이스 하나보다 낫다.
        // 5. Dependency Inversion Principle: 고수준 모듈은 저수준 모듈에 의존해서는 안 된다. 둘 다 추상화에 의존해야 한다.

    }

    private static void printResult(final int result) {
        System.out.println("계산 결과: " + result);
    }

    private static String[] splitString(final String input) {
        String[] tokens = input.split(" ");
        return tokens;
    }

    private static int operate(final String operator, int result, final String[] tokens, final int i) {
        switch (operator) {
            case "+" -> result += Integer.parseInt(tokens[i]);
            case "-" -> result -= Integer.parseInt(tokens[i]);
            case "*" -> result *= Integer.parseInt(tokens[i]);
            case "/" -> result /= Integer.parseInt(tokens[i]);
            default -> throw new IllegalArgumentException("Invalid operator: " + operator);
        }
        return result;
    }

    private static String getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("계산할 식을 입력하세요 (예: 1 + 2 - 3 * 4 / 5): ");
        String input = scanner.nextLine();
        return input;
    }

}
