package ai.houyi.zhuque.dao;

import ai.houyi.zhuque.dao.model.AuditAdvertiser;
import ai.houyi.zhuque.dao.model.AuditAdvertiserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuditAdvertiserMapper {
    long countByExample(AuditAdvertiserExample example);

    int deleteByExample(AuditAdvertiserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AuditAdvertiser record);

    int insertSelective(AuditAdvertiser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table advertiser_audit
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    AuditAdvertiser selectOneByExample(AuditAdvertiserExample example);

    List<AuditAdvertiser> selectByExample(AuditAdvertiserExample example);

    AuditAdvertiser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AuditAdvertiser record, @Param("example") AuditAdvertiserExample example);

    int updateByExample(@Param("record") AuditAdvertiser record, @Param("example") AuditAdvertiserExample example);

    int updateByPrimaryKeySelective(AuditAdvertiser record);

    int updateByPrimaryKey(AuditAdvertiser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table advertiser_audit
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int batchInsert(@Param("list") List<AuditAdvertiser> list);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table advertiser_audit
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int batchInsertSelective(@Param("list") List<AuditAdvertiser> list, @Param("selective") AuditAdvertiser.Column ... selective);
}