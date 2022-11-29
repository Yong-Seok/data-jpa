package study.datajpa.repository;

import lombok.RequiredArgsConstructor;
import study.datajpa.entity.Member;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@RequiredArgsConstructor
public class MemberRepositoryImpl implements MemberRepositoryCustom {

    @PersistenceContext
    private final EntityManager em;

    // RequiredArgsConstructor Annotation 사용
//    public MemberRepositoryCustomImpl(EntityManager em) {
//        this.em = em;
//    }

    @Override
    public List<Member> findMemberCustom() {
        return em.createQuery("select m from Member m")
                .getResultList();
    }
}
