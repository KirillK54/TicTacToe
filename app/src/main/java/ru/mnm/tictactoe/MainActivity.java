package ru.mnm.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    String krest, nol;
    TextView TextView, PlayerPoint, PCPoint;
    Button button1, button2, button3, button4, button5, button6, button7, button8, button9; //кнопки

    int PointsOfPlayer, PointsOfPC;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //регистрация
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        TextView = findViewById(R.id.textView);
        PlayerPoint = findViewById(R.id.PlayerPoint);
        PCPoint = findViewById(R.id.PCPoint);

        sharedPreferences = this.getSharedPreferences("krestikNolik", Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();

        PointsOfPlayer = sharedPreferences.getInt("PointsOfPlayer", 0);
        PlayerPoint.setText("" + PointsOfPlayer);

        PointsOfPC = sharedPreferences.getInt("PointsOfPC", 0);
        PCPoint.setText("" + PointsOfPC);
        krest = "X";
        nol = "0";
        TextView.setText("");
    }

    //присваивание
    public void clcBtn1(View view) {
        if (button1.getText() == "" && TextView.getText() == "") {
            button1.setText(krest);
            isPlayerWinner();
            if (TextView.getText() == "") {
                AIPC();
            }
        }
    }

    public void clcBtn2(View view) {
        if (button2.getText() == "" && TextView.getText() == "") {
            button2.setText(krest);
            isPlayerWinner();
            if (TextView.getText() == "") {
                AIPC();
            }
        }

    }

    public void clcBtn3(View view) {
        if (button3.getText() == "" && TextView.getText() == "") {
            button3.setText(krest);
            isPlayerWinner();
            if (TextView.getText() == "") {
                AIPC();
            }
        }
    }

    public void clcBtn4(View view) {
        if (button4.getText() == "" && TextView.getText() == "") {
            button4.setText(krest);
            isPlayerWinner();
            if (TextView.getText() == "") {
                AIPC();
            }
        }
    }

    public void clcBtn5(View view) {
        if (button5.getText() == "" && TextView.getText() == "") {
            button5.setText(krest);
            isPlayerWinner();
            if (TextView.getText() == "") {
                AIPC();
            }
        }
    }

    public void clcBtn6(View view) {
        if (button6.getText() == "" && TextView.getText() == "") {
            button6.setText(krest);
            isPlayerWinner();
            if (TextView.getText() == "") {
                AIPC();
            }
        }
    }

    public void clcBtn7(View view) {
        if (button7.getText() == "" && TextView.getText() == "") {
            button7.setText(krest);
            isPlayerWinner();
            if (TextView.getText() == "") {
                AIPC();
            }
        }
    }

    public void clcBtn8(View view) {
        if (button8.getText() == "" && TextView.getText() == "") {
            button8.setText(krest);
            isPlayerWinner();
            if (TextView.getText() == "") {
                AIPC();
            }
        }
    }

    public void clcBtn9(View view) {
        if (button9.getText() == "" && TextView.getText() == "") {
            button9.setText(krest);
            isPlayerWinner();
            if (TextView.getText() == "") {
                AIPC();
            }
        }
    }

    //логика игры:
    public void isPlayerWinner() {
        if (button1.getText() == krest && button2.getText() == krest && button3.getText() == krest) {
            button1.setBackgroundColor(Color.GREEN);
            button2.setBackgroundColor(Color.GREEN);
            button3.setBackgroundColor(Color.GREEN);
            TextView.setText(R.string.winner_massage);
            PointsOfPlayer++;
            PlayerPoint.setText("" + PointsOfPlayer);
            editor.putInt("PointsOfPlayer", PointsOfPlayer);
            editor.apply();
        } else if (button4.getText() == krest && button5.getText() == krest && button6.getText() == krest) {
            button4.setBackgroundColor(Color.GREEN);
            button5.setBackgroundColor(Color.GREEN);
            button6.setBackgroundColor(Color.GREEN);
            TextView.setText(R.string.winner_massage);
            PointsOfPlayer++;
            PlayerPoint.setText("" + PointsOfPlayer);
            editor.putInt("PointsOfPlayer", PointsOfPlayer);
            editor.apply();
        } else if (button7.getText() == krest && button8.getText() == krest && button9.getText() == krest) {
            button7.setBackgroundColor(Color.GREEN);
            button8.setBackgroundColor(Color.GREEN);
            button9.setBackgroundColor(Color.GREEN);
            TextView.setText(R.string.winner_massage);
            PointsOfPlayer++;
            PlayerPoint.setText("" + PointsOfPlayer);
            editor.putInt("PointsOfPlayer", PointsOfPlayer);
            editor.apply();
        } else if (button1.getText() == krest && button4.getText() == krest && button7.getText() == krest) {
            button1.setBackgroundColor(Color.GREEN);
            button4.setBackgroundColor(Color.GREEN);
            button7.setBackgroundColor(Color.GREEN);
            TextView.setText(R.string.winner_massage);
            PointsOfPlayer++;
            PlayerPoint.setText("" + PointsOfPlayer);
            editor.putInt("PointsOfPlayer", PointsOfPlayer);
            editor.apply();
        } else if (button2.getText() == krest && button5.getText() == krest && button8.getText() == krest) {
            button2.setBackgroundColor(Color.GREEN);
            button5.setBackgroundColor(Color.GREEN);
            button8.setBackgroundColor(Color.GREEN);
            TextView.setText(R.string.winner_massage);
            PointsOfPlayer++;
            PlayerPoint.setText("" + PointsOfPlayer);
            editor.putInt("PointsOfPlayer", PointsOfPlayer);
            editor.apply();
        } else if (button3.getText() == krest && button6.getText() == krest && button9.getText() == krest) {
            button3.setBackgroundColor(Color.GREEN);
            button6.setBackgroundColor(Color.GREEN);
            button9.setBackgroundColor(Color.GREEN);
            TextView.setText(R.string.winner_massage);
            PointsOfPlayer++;
            PlayerPoint.setText("" + PointsOfPlayer);
            editor.putInt("PointsOfPlayer", PointsOfPlayer);
            editor.apply();
        } else if (button1.getText() == krest && button5.getText() == krest && button9.getText() == krest) {
            button1.setBackgroundColor(Color.GREEN);
            button5.setBackgroundColor(Color.GREEN);
            button9.setBackgroundColor(Color.GREEN);
            TextView.setText(R.string.winner_massage);
            PointsOfPlayer++;
            PlayerPoint.setText("" + PointsOfPlayer);
            editor.putInt("PointsOfPlayer", PointsOfPlayer);
            editor.apply();
        } else if (button3.getText() == krest && button5.getText() == krest && button7.getText() == krest) {
            button3.setBackgroundColor(Color.GREEN);
            button5.setBackgroundColor(Color.GREEN);
            button7.setBackgroundColor(Color.GREEN);
            TextView.setText(R.string.winner_massage);
            PointsOfPlayer++;
            PlayerPoint.setText("" + PointsOfPlayer);
            editor.putInt("PointsOfPlayer", PointsOfPlayer);
            editor.apply();
        } else if (button1.getText() != "" && button2.getText() != "" && button3.getText() != "" &&
                button4.getText() != "" && button5.getText() != "" && button6.getText() != "" &&
                button7.getText() != "" && button8.getText() != "" && button9.getText() != "") {
            TextView.setText(R.string.draw_massage);
        }
    }

    public void isPСWinner() {
        if (button1.getText() == nol && button2.getText() == nol && button3.getText() == nol) {
            button1.setBackgroundColor(Color.RED);
            button2.setBackgroundColor(Color.RED);
            button3.setBackgroundColor(Color.RED);
            TextView.setText(R.string.pcwinner_massage);
            PointsOfPC++;
            PCPoint.setText("" + PointsOfPC);
            editor.putInt("PointsOfPC", PointsOfPC);
            editor.apply();
        } else if (button4.getText() == nol && button5.getText() == nol && button6.getText() == nol) {
            button4.setBackgroundColor(Color.RED);
            button5.setBackgroundColor(Color.RED);
            button6.setBackgroundColor(Color.RED);
            TextView.setText(R.string.pcwinner_massage);
            PointsOfPC++;
            PCPoint.setText("" + PointsOfPC);
            editor.putInt("PointsOfPC", PointsOfPC);
            editor.apply();
        } else if (button7.getText() == nol && button8.getText() == nol && button9.getText() == nol) {
            button7.setBackgroundColor(Color.RED);
            button8.setBackgroundColor(Color.RED);
            button9.setBackgroundColor(Color.RED);
            TextView.setText(R.string.pcwinner_massage);
            PointsOfPC++;
            PCPoint.setText("" + PointsOfPC);
            editor.putInt("PointsOfPC", PointsOfPC);
            editor.apply();
        } else if (button1.getText() == nol && button4.getText() == nol && button7.getText() == nol) {
            button1.setBackgroundColor(Color.RED);
            button4.setBackgroundColor(Color.RED);
            button7.setBackgroundColor(Color.RED);
            TextView.setText(R.string.pcwinner_massage);
            PointsOfPC++;
            PCPoint.setText("" + PointsOfPC);
            editor.putInt("PointsOfPC", PointsOfPC);
            editor.apply();
        } else if (button2.getText() == nol && button5.getText() == nol && button8.getText() == nol) {
            button2.setBackgroundColor(Color.RED);
            button5.setBackgroundColor(Color.RED);
            button8.setBackgroundColor(Color.RED);
            TextView.setText(R.string.pcwinner_massage);
            PointsOfPC++;
            PCPoint.setText("" + PointsOfPC);
            editor.putInt("PointsOfPC", PointsOfPC);
            editor.apply();
        } else if (button3.getText() == nol && button6.getText() == nol && button9.getText() == nol) {
            button3.setBackgroundColor(Color.RED);
            button6.setBackgroundColor(Color.RED);
            button9.setBackgroundColor(Color.RED);
            TextView.setText(R.string.pcwinner_massage);
            PointsOfPC++;
            PCPoint.setText("" + PointsOfPC);
            editor.putInt("PointsOfPC", PointsOfPC);
            editor.apply();
        } else if (button1.getText() == nol && button5.getText() == nol && button9.getText() == nol) {
            button1.setBackgroundColor(Color.RED);
            button5.setBackgroundColor(Color.RED);
            button9.setBackgroundColor(Color.RED);
            TextView.setText(R.string.pcwinner_massage);
            PointsOfPC++;
            PCPoint.setText("" + PointsOfPC);
            editor.putInt("PointsOfPC", PointsOfPC);
            editor.apply();
        } else if (button9.getText() == nol && button5.getText() == nol && button7.getText() == nol) {
            button3.setBackgroundColor(Color.RED);
            button5.setBackgroundColor(Color.RED);
            button7.setBackgroundColor(Color.RED);
            TextView.setText(R.string.pcwinner_massage);
            PointsOfPC++;
            PCPoint.setText("" + PointsOfPC);
            editor.putInt("PointsOfPC", PointsOfPC);
            editor.apply();
        }
    }

    //искусственный интеллект
    public void AIPC() {
        Random random = new Random();
        int ButtonAIClick = 1 + random.nextInt(9);
        switch (ButtonAIClick) {
            case (1):
                if (button1.getText() == "") {
                    button1.setText(nol);
                    isPСWinner();
                } else {
                    AIPC();
                }
                break;
            case (2):
                if (button2.getText() == "") {
                    button2.setText(nol);
                    isPСWinner();
                } else {
                    AIPC();
                }
                break;
            case (3):
                if (button3.getText() == "") {
                    button3.setText(nol);
                    isPСWinner();
                } else {
                    AIPC();
                }
                break;
            case (4):
                if (button4.getText() == "") {
                    button4.setText(nol);
                    isPСWinner();
                } else {
                    AIPC();
                }
                break;
            case (5):
                if (button5.getText() == "") {
                    button5.setText(nol);
                    isPСWinner();
                } else {
                    AIPC();
                }
                break;
            case (6):
                if (button6.getText() == "") {
                    button6.setText(nol);
                    isPСWinner();
                } else {
                    AIPC();
                }
                break;
            case (7):
                if (button7.getText() == "") {
                    button7.setText(nol);
                    isPСWinner();
                } else {
                    AIPC();
                }
                break;
            case (8):
                if (button8.getText() == "") {
                    button8.setText(nol);
                    isPСWinner();
                } else {
                    AIPC();
                }
                break;
            case (9):
                if (button9.getText() == "") {
                    button9.setText(nol);
                    isPСWinner();
                } else {
                    AIPC();
                }
                break;
        }
    }

    public void clickrestart(View view) {
        button1.setText("");
        button2.setText("");
        button3.setText("");
        button4.setText("");
        button5.setText("");
        button6.setText("");
        button7.setText("");
        button8.setText("");
        button9.setText("");
        TextView.setText("");

        button1.setBackgroundColor(button1.getContext().getResources().getColor(R.color.Purp));
        button2.setBackgroundColor(button2.getContext().getResources().getColor(R.color.Purp));
        button3.setBackgroundColor(button3.getContext().getResources().getColor(R.color.Purp));
        button4.setBackgroundColor(button4.getContext().getResources().getColor(R.color.Purp));
        button5.setBackgroundColor(button5.getContext().getResources().getColor(R.color.Purp));
        button6.setBackgroundColor(button6.getContext().getResources().getColor(R.color.Purp));
        button7.setBackgroundColor(button7.getContext().getResources().getColor(R.color.Purp));
        button8.setBackgroundColor(button8.getContext().getResources().getColor(R.color.Purp));
        button9.setBackgroundColor(button9.getContext().getResources().getColor(R.color.Purp));
    }

    public void onSettingsClick(View view) {
        startActivity(new Intent(MainActivity.this, SettingsActivity.class));
        finish();
    }

}