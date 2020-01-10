package com.league.service;

import com.league.model.Member;
import com.league.repository.MemberRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;


@Service
public class MemberService {

    private MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository){
        this.memberRepository = memberRepository;
    }

    public Member getMember(Long memberId) {
       return memberRepository.findById(memberId).orElse(null);
    }

    public Set<Member> getMembers() {
        return new HashSet<>(memberRepository.findAll());
    }

    public Member createMember(Member member) {
        return memberRepository.save(member);
    }

    public Member updateMember(Member member) {
        return memberRepository.save(member);
    }
}
