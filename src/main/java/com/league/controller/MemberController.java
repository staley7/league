package com.league.controller;

import com.league.model.Member;
import com.league.service.MemberService;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/api")
public class MemberController {

    private MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/member/{memberId}")
    public Member getMember(@PathVariable("memberId") Long memberId) {
        return memberService.getMember(memberId);
    }

    @GetMapping("/members")
    public Set<Member> getMembers() {
        return memberService.getMembers();
    }

    @PostMapping("/member")
    public Member createMember(@RequestBody Member member) {
        return memberService.createMember(member);
    }

    @PutMapping("/member")
    public Member updateMember(@RequestBody Member member) {
        return memberService.updateMember(member);

    }
}
