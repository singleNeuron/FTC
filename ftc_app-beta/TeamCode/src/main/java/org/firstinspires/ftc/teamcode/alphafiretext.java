package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.TouchSensor;

import fire.startfire;

/**
 * Created by FTC on 2017/3/8.
 */

@TeleOp(name = "alphaFireText")
public class alphafiretext extends OpMode {

    TouchSensor touch;
    DcMotor firemotor;
    startfire f = new startfire();

    @Override
    public void init () {

        touch = hardwareMap.touchSensor.get("touch");
        firemotor = hardwareMap.dcMotor.get("fire");

        f.SetHardware(touch, firemotor);

    }

    @Override
    public void start () {
        f.init();
    }

    @Override
    public void loop () {

        if (gamepad1.y) f.start();

    }

}
