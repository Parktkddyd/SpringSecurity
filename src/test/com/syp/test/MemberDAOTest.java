package com.syp.test;

import com.syp.web.domain.MemberVO;
import com.syp.web.persistence.MemberDAO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
        locations ={"file:src/main/webapp/WEB-INF/**/root-context.xml"}
)
public class MemberDAOTest {

    @Inject
    private MemberDAO dao;

    @Test
    public void testTime()throws Exception{

        System.out.println(dao.getTime());
    }

    @Test
    public void testInsertMember()throws Exception{
        MemberVO vo = new MemberVO();
        vo.setUserid("user00");
        vo.setUserpw("user00");
        vo.setUsername("USER00");
        vo.setEmail("user00@aaa.com");

        dao.insertMember(vo);
    }

    public void testReadMember()throws Exception{
        String id = "user00";

        MemberVO vo = dao.readMember(id);
        System.out.println(vo.getUsername());
    }

    public void testReadMemberWithPW()throws Exception{
            String id = "user00";
            String pw = "user00";

            MemberVO vo = dao.readWithPW(id, pw);

        System.out.println(vo.getRegdate());
    }

}
