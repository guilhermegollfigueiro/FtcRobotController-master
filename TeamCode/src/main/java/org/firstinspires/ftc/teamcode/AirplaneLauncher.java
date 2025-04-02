package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(name="Servo Control FTC", group="Launcher & Drive") // Define o OpMode como TeleOp
public class AirplaneLauncher extends OpMode {

    private Servo servo;

    private static final double MAX_POS = 1.0;
    private static final double MID_POS = 0.5;
    private static final double MIN_POS = 0.0;

    @Override
    public void init() {
        servo = hardwareMap.get(Servo.class, "servo");
        servo.setPosition(MID_POS);

        telemetry.addData("Status", "Servo tá TOPPER");
        telemetry.update();
    }

    @Override
    public void loop() {
        if (gamepad1.a) {  // se alguem apertar o botao a o servo gira ate 0
            servo.setPosition(MIN_POS);

        }

        telemetry.update();
    }
}