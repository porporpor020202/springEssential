package core.member;

public class MemberServiceImpl implements MemberService {

//    여기가 문제되는 지점. 이걸 Memory가 아니라, DB로 바꿀려면 지금 여기 코드를 바꿔야 하는 문제가 생김
//     이게 DIP 원칙 위배래. 인터페이스만 의존해야 한다고 함.

    private final MemberRepository memberRepository = new MemoryMemberRepository();

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }

}
