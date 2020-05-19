package models.validators;

import java.util.ArrayList;
import java.util.List;

import models.Report;

public class ReportValidator {
    public static List<String> validate(Report r) {
        List<String> errors = new ArrayList<String>();

        String title_error = _validateTitle(r.getTitle());
        if(!title_error.equals("")) {
            errors.add(title_error);
        }

        String content_error = _validateContent(r.getContent());
        if(!content_error.equals("")) {
            errors.add(content_error);
        }

        String work_time_error =_validateWork_time(r.getWork_time());
        if(!work_time_error.equals("")){
            errors.add(work_time_error);
        }

        String work_minute_error = _validateWork_minute(r.getWork_minute());
        if(!work_minute_error.equals("")){
            errors.add(work_minute_error);
        }
        String leave_time_error =_validateLeave_time(r.getLeave_time());
        if(!leave_time_error.equals("")){
            errors.add(leave_time_error);
        }
        String leave_minute_error = _validateLeave_minute(r.getLeave_minute());
        if(!leave_minute_error.equals("")){
            errors.add(leave_minute_error);
        }

       return errors;
    }

    private static String _validateTitle(String title) {
        if(title == null || title.equals("")) {
            return "タイトルを入力してください。";
        }


        return "";
    }

    private static String _validateContent(String content) {
        if(content == null || content.equals("")) {
            return "内容を入力してください。";
        }

        return "";
    }

    private static String _validateWork_time(Integer work_time) {
        if(  work_time>23 ){
            return "時間を入力してください。";
    }
        return"";
    }

    private static String _validateWork_minute(Integer work_minute) {
       if( 59<work_minute){
        return "分を入力してください。";
    }
        return"";
    }
    private static String _validateLeave_time(Integer leave_time) {
        if( 23<leave_time) {
            return "時間を入力してください。";
        }

        return"";
    }

    private static String _validateLeave_minute(Integer leave_minute) {
        if( 59<leave_minute  ) {

        return "分を入力してください";
        }
        return"";

    }
}

