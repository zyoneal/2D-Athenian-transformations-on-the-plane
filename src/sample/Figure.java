package sample;

public class Figure {
    private final Point center = new Point(0, 0);
    private final Point[] letter = {
            // П
            new Point(-15, -8), new Point(-14, -8), new Point(-14, 10), new Point(-11, 10), new Point(-11, -8), new Point(-10, -8), new Point(-10, 12), new Point(-15, 12),
            // В
            new Point(-8, -8), new Point(-8, 10), new Point(-4, 10), new Point(-4, 6), new Point(-6, 2), new Point(-4, -2), new Point(-4, -6),
            // 0
            new Point(1, -6), new Point(2, -8), new Point(4, -8), new Point(5, -6), new Point(5, 8), new Point(4, 10), new Point(2, 10), new Point(1, 8)
    };
    private final Point[] hole = {
            // O
            new Point(-20, -13), new Point(-20, -25), new Point(-16, -25), new Point(-16, -13),
            // O
            new Point(-9, -13), new Point(-9, -25), new Point(-5, -25), new Point(-5, -13),
            // O
            new Point(15, -13), new Point(15, -25), new Point(19, -25), new Point(19, -13),
            // O
            new Point(23, -13), new Point(23, -25), new Point(27, -25), new Point(27, -13),
            //В
            new Point(-6, 10), new Point(-4, 10), new Point(-4, 8), new Point(-6, 4),

            new Point(-6, -7), new Point(-4, -7), new Point(-4, -3), new Point(-6, 2),
            // O
            new Point(1, 10), new Point(1, -6), new Point(3, -6), new Point(3, 10)
    };

    private final Point[] number = {
            //2
            new Point(-30, -27), new Point(-24, -27), new Point(-24, -25), new Point(-28, -25), new Point(-24, -19), new Point(-24, -12), new Point(-25, -11), new Point(-29, -11), new Point(-30, -12), new Point(-30, -17), new Point(-29, -17), new Point(-29, -13), new Point(-26, -13), new Point(-26, -18), new Point(-30, -25),
            //0
            new Point(-22, -25), new Point(-21, -27), new Point(-17, -27), new Point(-16, -25), new Point(-16, -13), new Point(-17, -11), new Point(-21, -11), new Point(-22, -13),
            //0
            new Point(-11, -25), new Point(-10, -27), new Point(-6, -27), new Point(-5, -25), new Point(-5, -13), new Point(-6, -11), new Point(-10, -11), new Point(-11, -13),
            //5
            new Point(-3, -27), new Point(1, -27), new Point(1, -17), new Point(-2, -17), new Point(-2, -12), new Point(1, -12), new Point(1, -11), new Point(-3, -11), new Point(-3, -18), new Point(0, -18), new Point(0, -25), new Point(-3, -25),
            //2
            new Point(6, -27), new Point(12, -27), new Point(12, -25), new Point(8, -25), new Point(12, -19), new Point(12, -12), new Point(11, -11), new Point(7, -11), new Point(6, -12), new Point(6, -17), new Point(7, -17), new Point(7, -13), new Point(10, -13), new Point(10, -18), new Point(6, -25),
            //0
            new Point(14, -25), new Point(15, -27), new Point(19, -27), new Point(20, -25), new Point(20, -13), new Point(19, -11), new Point(15, -11), new Point(14, -13),
            //0
            new Point(22, -25), new Point(23, -27), new Point(27, -27), new Point(28, -25), new Point(28, -13), new Point(27, -11), new Point(23, -11), new Point(22, -13),
            //2
            new Point(30, -27), new Point(36, -27), new Point(36, -25), new Point(32, -25), new Point(36, -19), new Point(36, -12), new Point(35, -11), new Point(31, -11), new Point(30, -12), new Point(30, -17), new Point(31, -17), new Point(31, -13), new Point(34, -13), new Point(34, -18), new Point(30, -25)


    };

    private final Point[] dot = {

            new Point(-14, -27), new Point(-13, -27), new Point(-13, -26), new Point(-14, -26),
            new Point(3, -27), new Point(4, -27), new Point(4, -26), new Point(3, -26)

    };


    private int angle = 0;
    private double scale = 1;
    private final Pen pen;

    public Figure(Pen pen) {
        this.pen = pen;
    }

    public void draw() {
        // П
        calculatePoints();
        pen.drawLine(letter[0], letter[1]);
        pen.drawLine(letter[1], letter[2]);
        pen.drawLine(letter[2], letter[3]);
        pen.drawLine(letter[3], letter[4]);
        pen.drawLine(letter[4], letter[5]);
        pen.drawLine(letter[5], letter[6]);
        pen.drawLine(letter[6], letter[7]);
        pen.drawLine(letter[7], letter[0]);
        // В
        pen.drawLine(letter[8], letter[9]);
        pen.drawLine(letter[9], letter[10]);
        pen.drawLine(letter[10], letter[11]);
        pen.drawLine(letter[11], letter[12]);
        pen.drawLine(letter[12], letter[13]);
        pen.drawLine(letter[13], letter[14]);
        pen.drawLine(letter[14], letter[8]);

        pen.drawLine(hole[16], hole[17]);
        pen.drawLine(hole[17], hole[18]);
        pen.drawLine(hole[18], hole[19]);
        pen.drawLine(hole[19], hole[16]);

        pen.drawLine(hole[20], hole[21]);
        pen.drawLine(hole[21], hole[22]);
        pen.drawLine(hole[22], hole[23]);
        pen.drawLine(hole[23], hole[20]);

        // O
        pen.drawLine(letter[15], letter[16]);
        pen.drawLine(letter[16], letter[17]);
        pen.drawLine(letter[17], letter[18]);
        pen.drawLine(letter[18], letter[19]);
        pen.drawLine(letter[19], letter[20]);
        pen.drawLine(letter[20], letter[21]);
        pen.drawLine(letter[21], letter[22]);
        pen.drawLine(letter[22], letter[15]);

        pen.drawLine(hole[24], hole[25]);
        pen.drawLine(hole[25], hole[26]);
        pen.drawLine(hole[26], hole[27]);
        pen.drawLine(hole[27], hole[24]);

        //2
        pen.drawLine(number[0], number[1]);
        pen.drawLine(number[1], number[2]);
        pen.drawLine(number[2], number[3]);
        pen.drawLine(number[3], number[4]);
        pen.drawLine(number[4], number[5]);
        pen.drawLine(number[5], number[6]);
        pen.drawLine(number[6], number[7]);
        pen.drawLine(number[7], number[8]);
        pen.drawLine(number[8], number[9]);
        pen.drawLine(number[9], number[10]);
        pen.drawLine(number[10], number[11]);
        pen.drawLine(number[11], number[12]);
        pen.drawLine(number[12], number[13]);
        pen.drawLine(number[13], number[14]);
        pen.drawLine(number[14], number[0]);
        //0
        pen.drawLine(number[15], number[16]);
        pen.drawLine(number[16], number[17]);
        pen.drawLine(number[17], number[18]);
        pen.drawLine(number[18], number[19]);
        pen.drawLine(number[19], number[20]);
        pen.drawLine(number[20], number[21]);
        pen.drawLine(number[21], number[22]);
        pen.drawLine(number[22], number[15]);

        pen.drawLine(hole[0], hole[1]);
        pen.drawLine(hole[1], hole[2]);
        pen.drawLine(hole[2], hole[3]);
        pen.drawLine(hole[3], hole[0]);

        // .
        pen.drawLine(dot[0], dot[1]);
        pen.drawLine(dot[1], dot[2]);
        pen.drawLine(dot[2], dot[3]);
        pen.drawLine(dot[3], dot[0]);

        //0
        pen.drawLine(number[23], number[24]);
        pen.drawLine(number[24], number[25]);
        pen.drawLine(number[25], number[26]);
        pen.drawLine(number[26], number[27]);
        pen.drawLine(number[27], number[28]);
        pen.drawLine(number[28], number[29]);
        pen.drawLine(number[29], number[30]);
        pen.drawLine(number[30], number[23]);

        pen.drawLine(hole[4], hole[5]);
        pen.drawLine(hole[5], hole[6]);
        pen.drawLine(hole[6], hole[7]);
        pen.drawLine(hole[7], hole[4]);

        //5
        pen.drawLine(number[31], number[32]);
        pen.drawLine(number[32], number[33]);
        pen.drawLine(number[33], number[34]);
        pen.drawLine(number[34], number[35]);
        pen.drawLine(number[35], number[36]);
        pen.drawLine(number[36], number[37]);
        pen.drawLine(number[37], number[38]);
        pen.drawLine(number[38], number[39]);
        pen.drawLine(number[39], number[40]);
        pen.drawLine(number[40], number[41]);
        pen.drawLine(number[41], number[42]);
        pen.drawLine(number[42], number[31]);

        // .
        pen.drawLine(dot[4], dot[5]);
        pen.drawLine(dot[5], dot[6]);
        pen.drawLine(dot[6], dot[7]);
        pen.drawLine(dot[7], dot[4]);

        //2
        pen.drawLine(number[43], number[44]);
        pen.drawLine(number[44], number[45]);
        pen.drawLine(number[45], number[46]);
        pen.drawLine(number[46], number[47]);
        pen.drawLine(number[47], number[48]);
        pen.drawLine(number[48], number[49]);
        pen.drawLine(number[49], number[50]);
        pen.drawLine(number[50], number[51]);
        pen.drawLine(number[51], number[52]);
        pen.drawLine(number[52], number[53]);
        pen.drawLine(number[53], number[54]);
        pen.drawLine(number[54], number[55]);
        pen.drawLine(number[55], number[56]);
        pen.drawLine(number[56], number[57]);
        pen.drawLine(number[57], number[43]);

        //0
        pen.drawLine(number[58], number[59]);
        pen.drawLine(number[59], number[60]);
        pen.drawLine(number[60], number[61]);
        pen.drawLine(number[61], number[62]);
        pen.drawLine(number[62], number[63]);
        pen.drawLine(number[63], number[64]);
        pen.drawLine(number[64], number[65]);
        pen.drawLine(number[65], number[58]);

        pen.drawLine(hole[8], hole[9]);
        pen.drawLine(hole[9], hole[10]);
        pen.drawLine(hole[10], hole[11]);
        pen.drawLine(hole[11], hole[8]);

        //0
        pen.drawLine(number[66], number[67]);
        pen.drawLine(number[67], number[68]);
        pen.drawLine(number[68], number[69]);
        pen.drawLine(number[69], number[70]);
        pen.drawLine(number[70], number[71]);
        pen.drawLine(number[71], number[72]);
        pen.drawLine(number[72], number[73]);
        pen.drawLine(number[73], number[66]);

        pen.drawLine(hole[12], hole[13]);
        pen.drawLine(hole[13], hole[14]);
        pen.drawLine(hole[14], hole[15]);
        pen.drawLine(hole[15], hole[12]);

        //2
        pen.drawLine(number[74], number[75]);
        pen.drawLine(number[75], number[76]);
        pen.drawLine(number[76], number[77]);
        pen.drawLine(number[77], number[78]);
        pen.drawLine(number[78], number[79]);
        pen.drawLine(number[79], number[80]);
        pen.drawLine(number[80], number[81]);
        pen.drawLine(number[81], number[82]);
        pen.drawLine(number[82], number[83]);
        pen.drawLine(number[83], number[84]);
        pen.drawLine(number[84], number[85]);
        pen.drawLine(number[85], number[86]);
        pen.drawLine(number[86], number[87]);
        pen.drawLine(number[87], number[88]);
        pen.drawLine(number[88], number[74]);

    }

    public void move(int dx, int dy) {
        double x = center.getX();
        center.setX(x + dx);
        double y = center.getY();
        center.setY(y + dy);
    }

    public void zoom(double n) {
        scale *= n;
    }

    public void rotate(int deg) {
        angle += deg;
    }

    private void calculatePoints() {
        double deg = angle * (Math.PI / 180);
        double sin = Math.sin(deg);
        double cos = Math.cos(deg);
        double x0 = center.getX();
        double y0 = center.getY();
        double x, y;


// Внешний контур
        // П...........................................

        x = -15 * scale * cos - -8 * scale * sin;
        y = -15 * scale * sin + -8 * scale * cos;
        letter[0].setX(x + x0);
        letter[0].setY(y + y0);

        x = -14 * scale * cos - -8 * scale * sin;
        y = -14 * scale * sin + -8 * scale * cos;
        letter[1].setX(x + x0);
        letter[1].setY(y + y0);

        x = -14 * scale * cos - 10 * scale * sin;
        y = -14 * scale * sin + 10 * scale * cos;
        letter[2].setX(x + x0);
        letter[2].setY(y + y0);

        x = -11 * scale * cos - 10 * scale * sin;
        y = -11 * scale * sin + 10 * scale * cos;
        letter[3].setX(x + x0);
        letter[3].setY(y + y0);

        x = -11 * scale * cos - -8 * scale * sin;
        y = -11 * scale * sin + -8 * scale * cos;
        letter[4].setX(x + x0);
        letter[4].setY(y + y0);

        x = -10 * scale * cos - -8 * scale * sin;
        y = -10 * scale * sin + -8 * scale * cos;
        letter[5].setX(x + x0);
        letter[5].setY(y + y0);

        x = -10 * scale * cos - 12 * scale * sin;
        y = -10 * scale * sin + 12 * scale * cos;
        letter[6].setX(x + x0);
        letter[6].setY(y + y0);

        x = -15 * scale * cos - 12 * scale * sin;
        y = -15 * scale * sin + 12 * scale * cos;
        letter[7].setX(x + x0);
        letter[7].setY(y + y0);

        // В
        x = -7 * scale * cos - -8 * scale * sin;
        y = -7 * scale * sin + -8 * scale * cos;
        letter[8].setX(x + x0);
        letter[8].setY(y + y0);

        x = -7 * scale * cos - 12 * scale * sin;
        y = -7 * scale * sin + 12 * scale * cos;
        letter[9].setX(x + x0);
        letter[9].setY(y + y0);

        x = -3 * scale * cos - 12 * scale * sin;
        y = -3 * scale * sin + 12 * scale * cos;
        letter[10].setX(x + x0);
        letter[10].setY(y + y0);

        x = -3 * scale * cos - 7 * scale * sin;
        y = -3 * scale * sin + 7 * scale * cos;
        letter[11].setX(x + x0);
        letter[11].setY(y + y0);

        x = -5 * scale * cos - 3 * scale * sin;
        y = -5 * scale * sin + 3 * scale * cos;
        letter[12].setX(x + x0);
        letter[12].setY(y + y0);

        x = -3 * scale * cos - -2 * scale * sin;
        y = -3 * scale * sin + -2 * scale * cos;
        letter[13].setX(x + x0);
        letter[13].setY(y + y0);

        x = -3 * scale * cos - -8 * scale * sin;
        y = -3 * scale * sin + -8 * scale * cos;
        letter[14].setX(x + x0);
        letter[14].setY(y + y0);

        x = -6 * scale * cos - 10 * scale * sin;
        y = -6 * scale * sin + 10 * scale * cos;
        hole[16].setX(x + x0);
        hole[16].setY(y + y0);

        x = -4 * scale * cos - 10* scale * sin;
        y = -4 * scale * sin + 10 * scale * cos;
        hole[17].setX(x + x0);
        hole[17].setY(y + y0);

        x = -4 * scale * cos - 8 * scale * sin;
        y = -4 * scale * sin + 8 * scale * cos;
        hole[18].setX(x + x0);
        hole[18].setY(y + y0);

        x = -6 * scale * cos - 4 * scale * sin;
        y = -6 * scale * sin + 4 * scale * cos;
        hole[19].setX(x + x0);
        hole[19].setY(y + y0);

        x = -6 * scale * cos - -7 * scale * sin;
        y = -6 * scale * sin + -7 * scale * cos;
        hole[20].setX(x + x0);
        hole[20].setY(y + y0);

        x = -4 * scale * cos - -7* scale * sin;
        y = -4 * scale * sin + -7 * scale * cos;
        hole[21].setX(x + x0);
        hole[21].setY(y + y0);

        x = -4 * scale * cos - -3 * scale * sin;
        y = -4 * scale * sin + -3 * scale * cos;
        hole[22].setX(x + x0);
        hole[22].setY(y + y0);

        x = -6 * scale * cos - 2 * scale * sin;
        y = -6 * scale * sin + 2 * scale * cos;
        hole[23].setX(x + x0);
        hole[23].setY(y + y0);

        // О
        x = 0 * scale * cos - -6 * scale * sin;
        y = 0 * scale * sin + -6 * scale * cos;
        letter[15].setX(x + x0);
        letter[15].setY(y + y0);

        x = 1 * scale * cos - -8 * scale * sin;
        y = 1 * scale * sin + -8 * scale * cos;
        letter[16].setX(x + x0);
        letter[16].setY(y + y0);

        x = 3 * scale * cos - -8 * scale * sin;
        y = 3 * scale * sin + -8 * scale * cos;
        letter[17].setX(x + x0);
        letter[17].setY(y + y0);

        x = 4 * scale * cos - -6 * scale * sin;
        y = 4 * scale * sin + -6 * scale * cos;
        letter[18].setX(x + x0);
        letter[18].setY(y + y0);

        x = 4 * scale * cos - 10 * scale * sin;
        y = 4 * scale * sin + 10 * scale * cos;
        letter[19].setX(x + x0);
        letter[19].setY(y + y0);

        x = 3 * scale * cos - 12 * scale * sin;
        y = 3 * scale * sin + 12 * scale * cos;
        letter[20].setX(x + x0);
        letter[20].setY(y + y0);

        x = 1 * scale * cos - 12 * scale * sin;
        y = 1 * scale * sin + 12 * scale * cos;
        letter[21].setX(x + x0);
        letter[21].setY(y + y0);

        x = 0 * scale * cos - 10 * scale * sin;
        y = 0 * scale * sin + 10 * scale * cos;
        letter[22].setX(x + x0);
        letter[22].setY(y + y0);

       // new Point(1, 10), new Point(1, -6), new Point(3, -6), new Point(3, 10)
        x = 1 * scale * cos - 10 * scale * sin;
        y = 1 * scale * sin + 10 * scale * cos;
        hole[24].setX(x + x0);
        hole[24].setY(y + y0);

        x = 1 * scale * cos - -6* scale * sin;
        y = 1 * scale * sin + -6 * scale * cos;
        hole[25].setX(x + x0);
        hole[25].setY(y + y0);

        x = 3 * scale * cos - -6 * scale * sin;
        y = 3 * scale * sin + -6 * scale * cos;
        hole[26].setX(x + x0);
        hole[26].setY(y + y0);

        x = 3 * scale * cos - 10 * scale * sin;
        y = 3 * scale * sin + 10 * scale * cos;
        hole[27].setX(x + x0);
        hole[27].setY(y + y0);

        //2

        x = -29 * scale * cos - -27 * scale * sin;
        y = -29 * scale * sin + -27 * scale * cos;
        number[0].setX(x + x0);
        number[0].setY(y + y0);

        x = -23 * scale * cos - -27 * scale * sin;
        y = -23 * scale * sin + -27 * scale * cos;
        number[1].setX(x + x0);
        number[1].setY(y + y0);

        x = -23 * scale * cos - -25 * scale * sin;
        y = -23 * scale * sin + -25 * scale * cos;
        number[2].setX(x + x0);
        number[2].setY(y + y0);

        x = -27 * scale * cos - -25 * scale * sin;
        y = -27 * scale * sin + -25 * scale * cos;
        number[3].setX(x + x0);
        number[3].setY(y + y0);

        x = -23 * scale * cos - -19 * scale * sin;
        y = -23 * scale * sin + -19 * scale * cos;
        number[4].setX(x + x0);
        number[4].setY(y + y0);

        x = -23 * scale * cos - -12 * scale * sin;
        y = -23 * scale * sin + -12 * scale * cos;
        number[5].setX(x + x0);
        number[5].setY(y + y0);

        x = -24 * scale * cos - -11 * scale * sin;
        y = -24 * scale * sin + -11 * scale * cos;
        number[6].setX(x + x0);
        number[6].setY(y + y0);

        x = -28 * scale * cos - -11 * scale * sin;
        y = -28 * scale * sin + -11 * scale * cos;
        number[7].setX(x + x0);
        number[7].setY(y + y0);

        x = -29 * scale * cos - -12 * scale * sin;
        y = -29 * scale * sin + -12 * scale * cos;
        number[8].setX(x + x0);
        number[8].setY(y + y0);

        x = -29 * scale * cos - -17 * scale * sin;
        y = -29 * scale * sin + -17 * scale * cos;
        number[9].setX(x + x0);
        number[9].setY(y + y0);

        x = -28 * scale * cos - -17 * scale * sin;
        y = -28 * scale * sin + -17 * scale * cos;
        number[10].setX(x + x0);
        number[10].setY(y + y0);

        x = -28 * scale * cos - -13 * scale * sin;
        y = -28 * scale * sin + -13 * scale * cos;
        number[11].setX(x + x0);
        number[11].setY(y + y0);

        x = -25 * scale * cos - -13 * scale * sin;
        y = -25 * scale * sin + -13 * scale * cos;
        number[12].setX(x + x0);
        number[12].setY(y + y0);

        x = -25 * scale * cos - -18 * scale * sin;
        y = -25 * scale * sin + -18 * scale * cos;
        number[13].setX(x + x0);
        number[13].setY(y + y0);

        x = -29 * scale * cos - -25 * scale * sin;
        y = -29 * scale * sin + -25 * scale * cos;
        number[14].setX(x + x0);
        number[14].setY(y + y0);

        //0


        x = -21 * scale * cos - -25 * scale * sin;
        y = -21 * scale * sin + -25 * scale * cos;
        number[15].setX(x + x0);
        number[15].setY(y + y0);

        x = -20 * scale * cos - -27 * scale * sin;
        y = -20 * scale * sin + -27 * scale * cos;
        number[16].setX(x + x0);
        number[16].setY(y + y0);

        x = -16 * scale * cos - -27 * scale * sin;
        y = -16 * scale * sin + -27 * scale * cos;
        number[17].setX(x + x0);
        number[17].setY(y + y0);

        x = -15 * scale * cos - -25 * scale * sin;
        y = -15 * scale * sin + -25 * scale * cos;
        number[18].setX(x + x0);
        number[18].setY(y + y0);

        x = -15 * scale * cos - -13 * scale * sin;
        y = -15 * scale * sin + -13 * scale * cos;
        number[19].setX(x + x0);
        number[19].setY(y + y0);

        x = -16 * scale * cos - -11 * scale * sin;
        y = -16 * scale * sin + -11 * scale * cos;
        number[20].setX(x + x0);
        number[20].setY(y + y0);

        x = -20 * scale * cos - -11 * scale * sin;
        y = -20 * scale * sin + -11 * scale * cos;
        number[21].setX(x + x0);
        number[21].setY(y + y0);

        x = -21 * scale * cos - -13 * scale * sin;
        y = -21 * scale * sin + -13 * scale * cos;
        number[22].setX(x + x0);
        number[22].setY(y + y0);

        x = -20 * scale * cos - -13 * scale * sin;
        y = -20 * scale * sin + -13 * scale * cos;
        hole[0].setX(x + x0);
        hole[0].setY(y + y0);

        x = -20 * scale * cos - -25 * scale * sin;
        y = -20 * scale * sin + -25 * scale * cos;
        hole[1].setX(x + x0);
        hole[1].setY(y + y0);

        x = -16 * scale * cos - -25 * scale * sin;
        y = -16 * scale * sin + -25 * scale * cos;
        hole[2].setX(x + x0);
        hole[2].setY(y + y0);

        x = -16 * scale * cos - -13 * scale * sin;
        y = -16 * scale * sin + -13 * scale * cos;
        hole[3].setX(x + x0);
        hole[3].setY(y + y0);


        // .
        x = -13 * scale * cos - -27 * scale * sin;
        y = -13 * scale * sin + -27 * scale * cos;
        dot[0].setX(x + x0);
        dot[0].setY(y + y0);

        x = -12 * scale * cos - -27 * scale * sin;
        y = -12 * scale * sin + -27 * scale * cos;
        dot[1].setX(x + x0);
        dot[1].setY(y + y0);

        x = -12 * scale * cos - -26 * scale * sin;
        y = -12 * scale * sin + -26 * scale * cos;
        dot[2].setX(x + x0);
        dot[2].setY(y + y0);

        x = -13 * scale * cos - -26 * scale * sin;
        y = -13 * scale * sin + -26 * scale * cos;
        dot[3].setX(x + x0);
        dot[3].setY(y + y0);

//0
        x = -10 * scale * cos - -25 * scale * sin;
        y = -10 * scale * sin + -25 * scale * cos;
        number[23].setX(x + x0);
        number[23].setY(y + y0);

        x = -9 * scale * cos - -27 * scale * sin;
        y = -9 * scale * sin + -27 * scale * cos;
        number[24].setX(x + x0);
        number[24].setY(y + y0);

        x = -5 * scale * cos - -27 * scale * sin;
        y = -5 * scale * sin + -27 * scale * cos;
        number[25].setX(x + x0);
        number[25].setY(y + y0);

        x = -4 * scale * cos - -25 * scale * sin;
        y = -4 * scale * sin + -25 * scale * cos;
        number[26].setX(x + x0);
        number[26].setY(y + y0);

        x = -4 * scale * cos - -13 * scale * sin;
        y = -4 * scale * sin + -13 * scale * cos;
        number[27].setX(x + x0);
        number[27].setY(y + y0);

        x = -5 * scale * cos - -11 * scale * sin;
        y = -5 * scale * sin + -11 * scale * cos;
        number[28].setX(x + x0);
        number[28].setY(y + y0);

        x = -9 * scale * cos - -11 * scale * sin;
        y = -9 * scale * sin + -11 * scale * cos;
        number[29].setX(x + x0);
        number[29].setY(y + y0);

        x = -10 * scale * cos - -13 * scale * sin;
        y = -10 * scale * sin + -13 * scale * cos;
        number[30].setX(x + x0);
        number[30].setY(y + y0);

        x = -9 * scale * cos - -13 * scale * sin;
        y = -9 * scale * sin + -13 * scale * cos;
        hole[4].setX(x + x0);
        hole[4].setY(y + y0);

        x = -9 * scale * cos - -25 * scale * sin;
        y = -9 * scale * sin + -25 * scale * cos;
        hole[5].setX(x + x0);
        hole[5].setY(y + y0);

        x = -5 * scale * cos - -25 * scale * sin;
        y = -5 * scale * sin + -25 * scale * cos;
        hole[6].setX(x + x0);
        hole[6].setY(y + y0);

        x = -5 * scale * cos - -13 * scale * sin;
        y = -5 * scale * sin + -13 * scale * cos;
        hole[7].setX(x + x0);
        hole[7].setY(y + y0);

        //5
        x = -3 * scale * cos - -27 * scale * sin;
        y = -3 * scale * sin + -27 * scale * cos;
        number[31].setX(x + x0);
        number[31].setY(y + y0);

        x = 1 * scale * cos - -27 * scale * sin;
        y = 1 * scale * sin + -27 * scale * cos;
        number[32].setX(x + x0);
        number[32].setY(y + y0);

        x = 1 * scale * cos - -17 * scale * sin;
        y = 1 * scale * sin + -17 * scale * cos;
        number[33].setX(x + x0);
        number[33].setY(y + y0);

        x = -2 * scale * cos - -17 * scale * sin;
        y = -2 * scale * sin + -17 * scale * cos;
        number[34].setX(x + x0);
        number[34].setY(y + y0);

        x = -2 * scale * cos - -12 * scale * sin;
        y = -2 * scale * sin + -12 * scale * cos;
        number[35].setX(x + x0);
        number[35].setY(y + y0);

        x = 1 * scale * cos - -12 * scale * sin;
        y = 1 * scale * sin + -12 * scale * cos;
        number[36].setX(x + x0);
        number[36].setY(y + y0);

        x = 1 * scale * cos - -11 * scale * sin;
        y = 1 * scale * sin + -11 * scale * cos;
        number[37].setX(x + x0);
        number[37].setY(y + y0);

        x = -3 * scale * cos - -11 * scale * sin;
        y = -3 * scale * sin + -11 * scale * cos;
        number[38].setX(x + x0);
        number[38].setY(y + y0);

        x = -3 * scale * cos - -18 * scale * sin;
        y = -3 * scale * sin + -18 * scale * cos;
        number[39].setX(x + x0);
        number[39].setY(y + y0);

        x = 0 * scale * cos - -18 * scale * sin;
        y = 0 * scale * sin + -18 * scale * cos;
        number[40].setX(x + x0);
        number[40].setY(y + y0);

        x = 0 * scale * cos - -25 * scale * sin;
        y = 0 * scale * sin + -25 * scale * cos;
        number[41].setX(x + x0);
        number[41].setY(y + y0);

        x = -3 * scale * cos - -25 * scale * sin;
        y = -3 * scale * sin + -25 * scale * cos;
        number[42].setX(x + x0);
        number[42].setY(y + y0);

        // .
        x = 3 * scale * cos - -27 * scale * sin;
        y = 3 * scale * sin + -27 * scale * cos;
        dot[4].setX(x + x0);
        dot[4].setY(y + y0);

        x = 4 * scale * cos - -27 * scale * sin;
        y = 4 * scale * sin + -27 * scale * cos;
        dot[5].setX(x + x0);
        dot[5].setY(y + y0);

        x = 4 * scale * cos - -25 * scale * sin;
        y = 4 * scale * sin + -26 * scale * cos;
        dot[6].setX(x + x0);
        dot[6].setY(y + y0);

        x = 3 * scale * cos - -25 * scale * sin;
        y = 3 * scale * sin + -26 * scale * cos;
        dot[7].setX(x + x0);
        dot[7].setY(y + y0);

        //2

        x = 6 * scale * cos - -27 * scale * sin;
        y = 6 * scale * sin + -27 * scale * cos;
        number[43].setX(x + x0);
        number[43].setY(y + y0);

        x = 12 * scale * cos - -27 * scale * sin;
        y = 12 * scale * sin + -27 * scale * cos;
        number[44].setX(x + x0);
        number[44].setY(y + y0);

        x = 12 * scale * cos - -25 * scale * sin;
        y = 12 * scale * sin + -25 * scale * cos;
        number[45].setX(x + x0);
        number[45].setY(y + y0);

        x = 8 * scale * cos - -25 * scale * sin;
        y = 8 * scale * sin + -25 * scale * cos;
        number[46].setX(x + x0);
        number[46].setY(y + y0);

        x = 12 * scale * cos - -19 * scale * sin;
        y = 12 * scale * sin + -19 * scale * cos;
        number[47].setX(x + x0);
        number[47].setY(y + y0);

        x = 12 * scale * cos - -12 * scale * sin;
        y = 12 * scale * sin + -12 * scale * cos;
        number[48].setX(x + x0);
        number[48].setY(y + y0);

        x = 11 * scale * cos - -11 * scale * sin;
        y = 11 * scale * sin + -11 * scale * cos;
        number[49].setX(x + x0);
        number[49].setY(y + y0);

        x = 7 * scale * cos - -11 * scale * sin;
        y = 7 * scale * sin + -11 * scale * cos;
        number[50].setX(x + x0);
        number[50].setY(y + y0);

        x = 6 * scale * cos - -12 * scale * sin;
        y = 6 * scale * sin + -12 * scale * cos;
        number[51].setX(x + x0);
        number[51].setY(y + y0);

        x = 6 * scale * cos - -17 * scale * sin;
        y = 6 * scale * sin + -17 * scale * cos;
        number[52].setX(x + x0);
        number[52].setY(y + y0);

        x = 7 * scale * cos - -17 * scale * sin;
        y = 7 * scale * sin + -17 * scale * cos;
        number[53].setX(x + x0);
        number[53].setY(y + y0);

        x = 7 * scale * cos - -13 * scale * sin;
        y = 7 * scale * sin + -13 * scale * cos;
        number[54].setX(x + x0);
        number[54].setY(y + y0);

        x = 10 * scale * cos - -13 * scale * sin;
        y = 10 * scale * sin + -13 * scale * cos;
        number[55].setX(x + x0);
        number[55].setY(y + y0);

        x = 10 * scale * cos - -18 * scale * sin;
        y = 10 * scale * sin + -18 * scale * cos;
        number[56].setX(x + x0);
        number[56].setY(y + y0);

        x = 6 * scale * cos - -25 * scale * sin;
        y = 6 * scale * sin + -25 * scale * cos;
        number[57].setX(x + x0);
        number[57].setY(y + y0);

        //0


        x = 14 * scale * cos - -25 * scale * sin;
        y = 14 * scale * sin + -25 * scale * cos;
        number[58].setX(x + x0);
        number[58].setY(y + y0);

        x = 15 * scale * cos - -27 * scale * sin;
        y = 15 * scale * sin + -27 * scale * cos;
        number[59].setX(x + x0);
        number[59].setY(y + y0);

        x = 19 * scale * cos - -27 * scale * sin;
        y = 19 * scale * sin + -27 * scale * cos;
        number[60].setX(x + x0);
        number[60].setY(y + y0);

        x = 20 * scale * cos - -25 * scale * sin;
        y = 20 * scale * sin + -25 * scale * cos;
        number[61].setX(x + x0);
        number[61].setY(y + y0);

        x = 20 * scale * cos - -13 * scale * sin;
        y = 20 * scale * sin + -13 * scale * cos;
        number[62].setX(x + x0);
        number[62].setY(y + y0);

        x = 19 * scale * cos - -11 * scale * sin;
        y = 19 * scale * sin + -11 * scale * cos;
        number[63].setX(x + x0);
        number[63].setY(y + y0);

        x = 15 * scale * cos - -11 * scale * sin;
        y = 15 * scale * sin + -11 * scale * cos;
        number[64].setX(x + x0);
        number[64].setY(y + y0);

        x = 14 * scale * cos - -13 * scale * sin;
        y = 14 * scale * sin + -13 * scale * cos;
        number[65].setX(x + x0);
        number[65].setY(y + y0);


        x = 15 * scale * cos - -13 * scale * sin;
        y = 15 * scale * sin + -13 * scale * cos;
        hole[8].setX(x + x0);
        hole[8].setY(y + y0);

        x = 15 * scale * cos - -25 * scale * sin;
        y = 15 * scale * sin + -25 * scale * cos;
        hole[9].setX(x + x0);
        hole[9].setY(y + y0);

        x = 19 * scale * cos - -25 * scale * sin;
        y = 19 * scale * sin + -25 * scale * cos;
        hole[10].setX(x + x0);
        hole[10].setY(y + y0);

        x = 19 * scale * cos - -13 * scale * sin;
        y = 19 * scale * sin + -13 * scale * cos;
        hole[11].setX(x + x0);
        hole[11].setY(y + y0);


//0


        x = 22 * scale * cos - -25 * scale * sin;
        y = 22 * scale * sin + -25 * scale * cos;
        number[66].setX(x + x0);
        number[66].setY(y + y0);

        x = 23 * scale * cos - -27 * scale * sin;
        y = 23 * scale * sin + -27 * scale * cos;
        number[67].setX(x + x0);
        number[67].setY(y + y0);

        x = 27 * scale * cos - -27 * scale * sin;
        y = 27 * scale * sin + -27 * scale * cos;
        number[68].setX(x + x0);
        number[68].setY(y + y0);

        x = 28 * scale * cos - -25 * scale * sin;
        y = 28 * scale * sin + -25 * scale * cos;
        number[69].setX(x + x0);
        number[69].setY(y + y0);

        x = 28 * scale * cos - -13 * scale * sin;
        y = 28 * scale * sin + -13 * scale * cos;
        number[70].setX(x + x0);
        number[70].setY(y + y0);

        x = 27 * scale * cos - -11 * scale * sin;
        y = 27 * scale * sin + -11 * scale * cos;
        number[71].setX(x + x0);
        number[71].setY(y + y0);

        x = 23 * scale * cos - -11 * scale * sin;
        y = 23 * scale * sin + -11 * scale * cos;
        number[72].setX(x + x0);
        number[72].setY(y + y0);

        x = 22 * scale * cos - -13 * scale * sin;
        y = 22 * scale * sin + -13 * scale * cos;
        number[73].setX(x + x0);
        number[73].setY(y + y0);

        //TODO

        x = 23 * scale * cos - -13 * scale * sin;
        y = 23 * scale * sin + -13 * scale * cos;
        hole[12].setX(x + x0);
        hole[12].setY(y + y0);

        x = 23 * scale * cos - -25 * scale * sin;
        y = 23 * scale * sin + -25 * scale * cos;
        hole[13].setX(x + x0);
        hole[13].setY(y + y0);

        x = 27 * scale * cos - -25 * scale * sin;
        y = 27 * scale * sin + -25 * scale * cos;
        hole[14].setX(x + x0);
        hole[14].setY(y + y0);

        x = 27 * scale * cos - -13 * scale * sin;
        y = 27 * scale * sin + -13 * scale * cos;
        hole[15].setX(x + x0);
        hole[15].setY(y + y0);

        //2

        x = 30 * scale * cos - -27 * scale * sin;
        y = 30 * scale * sin + -27 * scale * cos;
        number[74].setX(x + x0);
        number[74].setY(y + y0);

        x = 36 * scale * cos - -27 * scale * sin;
        y = 36 * scale * sin + -27 * scale * cos;
        number[75].setX(x + x0);
        number[75].setY(y + y0);

        x = 36 * scale * cos - -25 * scale * sin;
        y = 36 * scale * sin + -25 * scale * cos;
        number[76].setX(x + x0);
        number[76].setY(y + y0);

        x = 32 * scale * cos - -25 * scale * sin;
        y = 32 * scale * sin + -25 * scale * cos;
        number[77].setX(x + x0);
        number[77].setY(y + y0);

        x = 36 * scale * cos - -19 * scale * sin;
        y = 36 * scale * sin + -19 * scale * cos;
        number[78].setX(x + x0);
        number[78].setY(y + y0);

        x = 36 * scale * cos - -12 * scale * sin;
        y = 36 * scale * sin + -12 * scale * cos;
        number[79].setX(x + x0);
        number[79].setY(y + y0);

        x = 35 * scale * cos - -11 * scale * sin;
        y = 35 * scale * sin + -11 * scale * cos;
        number[80].setX(x + x0);
        number[80].setY(y + y0);

        x = 31 * scale * cos - -11 * scale * sin;
        y = 31 * scale * sin + -11 * scale * cos;
        number[81].setX(x + x0);
        number[81].setY(y + y0);

        x = 30 * scale * cos - -12 * scale * sin;
        y = 30 * scale * sin + -12 * scale * cos;
        number[82].setX(x + x0);
        number[82].setY(y + y0);

        x = 30 * scale * cos - -17 * scale * sin;
        y = 30 * scale * sin + -17 * scale * cos;
        number[83].setX(x + x0);
        number[83].setY(y + y0);

        x = 31 * scale * cos - -17 * scale * sin;
        y = 31 * scale * sin + -17 * scale * cos;
        number[84].setX(x + x0);
        number[84].setY(y + y0);

        x = 31 * scale * cos - -13 * scale * sin;
        y = 31 * scale * sin + -13 * scale * cos;
        number[85].setX(x + x0);
        number[85].setY(y + y0);

        x = 34 * scale * cos - -13 * scale * sin;
        y = 34 * scale * sin + -13 * scale * cos;
        number[86].setX(x + x0);
        number[86].setY(y + y0);

        x = 34 * scale * cos - -18 * scale * sin;
        y = 34 * scale * sin + -18 * scale * cos;
        number[87].setX(x + x0);
        number[87].setY(y + y0);

        x = 30 * scale * cos - -25 * scale * sin;
        y = 30 * scale * sin + -25 * scale * cos;
        number[88].setX(x + x0);
        number[88].setY(y + y0);

    }
}