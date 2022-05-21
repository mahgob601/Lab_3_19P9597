public class Watch_P3 {
    public String state = "NORMAL";
    public String state1 = "TIME";
    public String state2 = "min";
    public String state3 = "ALARM";
    int m = 0, h = 0, D = 1, M = 1, Y = 2000;

    String IO(char x) {
        switch (state) {
            case "NORMAL": {
                if (x == 'c') this.state = "UPDATE";
                if (x == 'b') this.state = "ALARM";
                if (x == 'a') if (state1 == "TIME") {
                    state1 = "DATE";
                    return this.DisplayDate();
                } else {
                    state1 = "TIME";
                    return this.DisplayTIME();
                }
                return state;
            }
            case "UPDATE": {
                if (x == 'd') state = "NORMAL";
                else if (x == 'c') state = "UPDATE";
                else {
                    switch (state2) {
                        case "min": {
                            if (x == 'a') state2 = "hour";
                            if (x == 'b') {
                                this.m = (m + 1) % 60;
                                return this.DisplayTIME();
                            }
                            break;
                        }
                        case "hour": {
                            if (x == 'a') state2 = "day";
                            if (x == 'b') {
                                this.h = (h + 1) % 12 + 1;
                                return this.DisplayTIME();
                            }
                            break;
                        }
                        case "day": {
                            if (x == 'a') state2 = "month";
                            if (x == 'b') {
                                this.D = (D + 1) % 30 + 1;
                                return this.DisplayTIME();
                            }
                            break;

                        }
                        case "month": {
                            if (x == 'a') state2 = "year";
                            if (x == 'b') {
                                this.M = (M + 1) % 12 + 1;
                                return this.DisplayTIME();
                            }
                            break;
                        }
                        case "year": {
                            if (x == 'a') state = "NORMAL";
                            if (x == 'b') {
                                this.Y = (Y + 1);
                                return this.DisplayTIME();
                            }
                        }
                        break;
                    }
                } return state;
            }
            case "ALARM": {
                if (x == 'd') {
                    state = "NORMAL";
                    return state;
                } else if (x == 'a') if (state3 == "ALARM") {
                    state3 = "CHIME";
                    return state3;
                } else {
                    state = "ALARM";
                    return state3;
                }
            }
            return state;
        } return state;
    }

    String DisplayDate() {
        System.out.println(Y + "-" + M + "-" + D);
        return (Y + "-" + M + "-" + D);
    }

    String DisplayTIME() {
        System.out.println(h + ":" + m);
        return (h + ":" + m);
    }

    public static void main(String args[]) {
    }
}