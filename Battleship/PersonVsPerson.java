import java.util.Scanner;

public class PersonVsPerson
{
    // 0- nothing, 1- boat exists, 2- miss, 3- hit
    private int [][] person1;
    private int [][] person2;
    private int person;
    public PersonVsPerson() {
        person1 = new int[10][10];
        person2 = new int[10][10];
        choose();
    }
    
    public void choose() {
        System.out.println("Person1, please choose ur location");
        person = 1;
        inputForMap();
        person = 2;
        inputForMap();
        
        while (gameOver() == 0) {
            guessMove()
        }
    }
    
    private void guessMove(int person) {
        Scanner in = new Scanner(System.in);
        int rval, cval;
        rval = in.nextInt();
        cval = in.nextInt();
        int curPos = 0;
        if (person == 1) {
            curPos = person1[rval][cval];
        }
        if (person == 2) {
            curPos = person2[rval][cval];
        }
        
        if (curPos == 0) {
            if (person == 1) {
                person1[rval][cval] = 2;
            } else {
                person2[rval][cval] = 2;
            }
        }
        
        if (curPos == 1) {
            if (person == 1) {
                person1[rval][cval] = 3;
                guessMove(1);
            } else {
                person2[rval][cval] = 3;
                guessMove(2);
            }
        }
    }
    
    private int gameOver() {
        int person1Val = 0;
        int person2Val = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (person1[i][j] == 3) {
                    person1Val++;
                }
                if (person2[i][j] == 3) {
                    person2Val++;
                }
            }
        }
        
        if (person1Val == 30) {
            return 1;
        }
        
        if (person2Val == 30) {
            return 2;
        }
        
        return 0;
    }
    
    //1 boat size 5, 2 boat size 4, 3 boat size 3, 4 boat size 2
    
    private void drawMap(int rval, int cval, int length, int direction) {
        //horizontally
        if (direction == 0) {
            for (int i = cval; i < cval + length; i++) {
                if (person == 1) {
                    person1[rval][i] = 1;
                } else {
                    person2[rval][i] = 1;
                }
            }
        }
        
        //vertically
        if (direction == 1) {
            for (int i = rval; i < rval + length; i++) {
                if (person == 1) {
                    person1[i][cval] = 1;
                } else {
                    person2[i][cval] = 1;
                }
            }
        }
    }
    
    public void inputForMap() {
        Scanner in = new Scanner(System.in);
        // inputting size 5 boat
        int a, b, c;
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        drawMap(a, b, 5, c);
        for (int i = 0; i < 2; i++) {
            a = in.nextInt();
            b = in.nextInt();
            c = in.nextInt();
            drawMap(a, b, 4, c);
        }
        for (int i = 0; i < 3; i++) {
            a = in.nextInt();
            b = in.nextInt();
            c = in.nextInt();
            drawMap(a, b, 3, c);
        }
        for (int i = 0; i < 4; i++) {
            a = in.nextInt();
            b = in.nextInt();
            c = in.nextInt();
            drawMap(a, b, 2, c);
        }
    }
    
}
