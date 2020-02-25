package com.bdqn.response;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Result {
    private boolean success;
    private Integer code;
    private String message;
    private Object data;

    public Result(boolean success,Integer code,String message){
        this.success=success;
        this.code=code;
        this.message=message;
    }

    /*public Result(ResultCode code){
        this.success = code.success;
        this.code = code.code;
        this.message = code.message;
    }

    public Result(ResultCode code,Object data){
        this.success = code.success;
        this.code = code.code;
        this.message = code.message;
        this.data = data;
    }




    public static Result SUCCESS(){
        return new Result(ResultCode.SUCCESS);
    }

    public static Result FAIL(){
        return new Result(ResultCode.FAIL);
    }*/

}
