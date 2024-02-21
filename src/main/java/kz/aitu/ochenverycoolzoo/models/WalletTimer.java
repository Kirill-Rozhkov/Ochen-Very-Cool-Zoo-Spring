package kz.aitu.ochenverycoolzoo.models;

import java.util.Timer;
import java.util.TimerTask;

public class WalletTimer {
    private Timer timer;
    private boolean isTimeExpired;

    public WalletTimer(int minutes) {
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                isTimeExpired = true;
                timer.cancel();
            }
        }, minutes * 60 * 1000);
    }

    public boolean isTimeExpired() {
        return isTimeExpired;
    }
}
