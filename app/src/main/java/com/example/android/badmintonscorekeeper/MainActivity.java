package com.example.android.badmintonscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int TeamAScore = 0;
    int TeamBScore = 0;

    //Individual stat inits
    //PA
    int PAAce = 0;
    int PAIn = 0;
    int PAOut = 0;
    int PANet = 0;
    int PAFault = 0;

    //PB
    int PBAce = 0;
    int PBIn = 0;
    int PBOut = 0;
    int PBNet = 0;
    int PBFault = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayTeamA(TeamAScore);
        displayTeamB(TeamBScore);
    }

    //Btn presses for TeamA
    public void paAceBtn(View view) {
        PAAce++;
        TeamAScore++;
        displayTeamA(TeamAScore);
        dTeamAAce(PAAce);
    }
    public void paInBtn(View view) {
        PAIn++;
        TeamAScore++;
        displayTeamA(TeamAScore);
        dTeamAIn(PAIn);
    }
    public void paOpOutBtn(View view) {
        PAOut++;
        TeamAScore++;
        displayTeamA(TeamAScore);
        dTeamAOut(PAOut);
    }
    public void paOpNetBtn(View view) {
        PANet++;
        TeamAScore++;
        displayTeamA(TeamAScore);
        dTeamANet(PANet);
    }
    public void paFaultBtn(View view){
        PAFault++;
        TeamAScore++;
        displayTeamA(TeamAScore);
        dTeamAFault(PAFault);
    }

    //Btn presses for TeamB
    public void pbAceBtn(View view) {
        PBAce++;
        TeamBScore++;
        displayTeamB(TeamBScore);
        dTeamBAce(PBAce);
    }
    public void pbInBtn(View view) {
        PBIn++;
        TeamBScore++;
        displayTeamB(TeamBScore);
        dTeamBIn(PBIn);
    }
    public void pbOpOutBtn(View view) {
        PBOut++;
        TeamBScore++;
        displayTeamB(TeamBScore);
        dTeamBOut(PBOut);
    }
    public void pbOpNetBtn(View view) {
        PBNet++;
        TeamBScore++;
        displayTeamB(TeamBScore);
        dTeamBNet(PBNet);
    }
    public void pbFaultBtn(View view){
        PBFault++;
        TeamBScore++;
        displayTeamB(TeamBScore);
        dTeamBFault(PBFault);
    }

    //Displaying the scores and stats for TeamA
    public void displayTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.PAScore);
        scoreView.setText(String.valueOf(score));
    }
    public void dTeamAAce(int score) {
        TextView scoreView = (TextView) findViewById(R.id.PA_Aces);
        scoreView.setText(String.valueOf(score));
    }
    public void dTeamAIn(int score) {
        TextView scoreView = (TextView) findViewById(R.id.PA_In);
        scoreView.setText(String.valueOf(score));
    }
    public void dTeamAOut(int score) {
        TextView scoreView = (TextView) findViewById(R.id.PA_OpOut);
        scoreView.setText(String.valueOf(score));
    }
    public void dTeamANet(int score) {
        TextView scoreView = (TextView) findViewById(R.id.PA_OpNet);
        scoreView.setText(String.valueOf(score));
    }
    public void dTeamAFault(int score){
        TextView scoreView = (TextView) findViewById(R.id.PA_Faults);
        scoreView.setText(String.valueOf(score));
    }

    //Displaying the scores and stats for TeamB
    public void displayTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.PBScore);
        scoreView.setText(String.valueOf(score));
    }
    public void dTeamBAce(int score) {
        TextView scoreView = (TextView) findViewById(R.id.PB_Aces);
        scoreView.setText(String.valueOf(score));
    }
    public void dTeamBIn(int score) {
        TextView scoreView = (TextView) findViewById(R.id.PB_In);
        scoreView.setText(String.valueOf(score));
    }
    public void dTeamBOut(int score) {
        TextView scoreView = (TextView) findViewById(R.id.PB_OpOut);
        scoreView.setText(String.valueOf(score));
    }
    public void dTeamBNet(int score) {
        TextView scoreView = (TextView) findViewById(R.id.PB_OpNet);
        scoreView.setText(String.valueOf(score));
    }
    public void dTeamBFault(int score){
        TextView scoreView = (TextView) findViewById(R.id.PB_Faults);
        scoreView.setText(String.valueOf(score));
    }

    //reset button
    public void ResetData(View view){
        TeamAScore = 0;
        TeamBScore = 0;
        PAAce = 0;
        PAIn = 0;
        PAOut = 0;
        PANet = 0;
        PAFault = 0;
        PBAce = 0;
        PBIn = 0;
        PBOut = 0;
        PBNet = 0;
        PBFault = 0;
        displayTeamA(TeamAScore);
        displayTeamB(TeamBScore);
        dTeamAAce(PAAce);
        dTeamAIn(PAIn);
        dTeamAOut(PAOut);
        dTeamANet(PAIn);
        dTeamAFault(PAFault);
        dTeamBAce(PBAce);
        dTeamBIn(PBIn);
        dTeamBOut(PBOut);
        dTeamBNet(PBIn);
        dTeamBFault(PBFault);
    }

}
