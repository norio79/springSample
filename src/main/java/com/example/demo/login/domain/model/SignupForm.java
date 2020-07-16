package com.example.demo.login.domain.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import lombok.Data;

@Data
public class SignupForm {
	
	//必須入力、メールアドレス形式

	private String userId;//ユーザーID
	
    //必須入力、長さ4から100桁まで、半角英数字のみ

	private String password;//パスワード

	//必須入力

	private String userName;//ユーザー名
	
	//必須入力
	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private Date birthday;//誕生日
	
	//値が20から100まで

	private int age;//年齢
	
	//falseのみ可能

	private boolean marriage;//結婚ステータス
}
