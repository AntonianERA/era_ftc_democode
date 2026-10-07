package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;

public class spin_motor extends LinearOpMode
{
 private DcMotor spinner = null;
    @Override

    public void runOpMode()
    {
        spinner = hardwareMap.get(DcMotor.class, "spinner");
        spinner.setDirection(DcMotorSimple.Direction.FORWARD);
        waitForStart();

        while(opModeIsActive()) {
            /*startShoot();
            servo();
            rotate120();
            servo();
            rotate120();
            servo();
            endShoot(); */


            if (gamepad1.a) {
                spinner.setPower(.6);
            }
        }
    }




}

