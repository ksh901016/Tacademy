package com.tacademy.sam.test;

import java.util.ArrayList;

import com.google.gson.Gson;
import com.tacademy.sam.vo.Member;
import com.tacademy.sam.vo.Result;

public class MemberTest {

	public MemberTest() {
		Member member = new Member();
		member.setName("홍길동");
		member.setAddress("서울");
		member.setAge(30);
		
//		String s = member.toString();
//		System.out.println(s);
		Gson gson = new Gson();
		
		//member 정보를 json 형식으로 변환
		String s = gson.toJson(member);
		System.out.println(s);
		
		//json형식을 member 틀에 맞게 클래스생성
		Member m1 = gson.fromJson(s, Member.class); //(json 문자열, json문자열로 만들 수 있는 클래스타입을 준다.(클래스원형))
		System.out.println(m1);
		
		ArrayList<Member> list = new ArrayList<Member>();
		
		list.add(new Member("홍길동1", "서울1", 30));
		list.add(new Member("홍길동2", "서울3", 40));
		list.add(new Member("홍길동3", "서울5", 50));
		list.add(new Member("홍길동4", "서울2", 60));
		list.add(new Member("홍길동5", "서울8", 70));
		
		String s1 = gson.toJson(list); //객체를 넣을수도잇음
		System.out.println(s1); //json Array로 생성됨 (안드로이드에서 exception 떨어짐) ,(그냥만들어서 json을 쏜다면..)
		
		Result result = new Result();
		result.setList(list);
		if(list.size()>0){
			result.setStatus("success");
		}else{
			result.setStatus("fail");
		}
		result.setCount(list.size());
		//중간에 result 객체를 만들어 필드를 채우고 
		//그 result객체를 사용하여 객체생성
		//얻어진 문자열을 json문자열로 변경하여 쏴주면됨 (서버 개발자가 하는일)
		String s2 = gson.toJson(result);
		System.out.println(s2);
	}

	public static void main(String[] args) {
		new MemberTest();
	}

}
