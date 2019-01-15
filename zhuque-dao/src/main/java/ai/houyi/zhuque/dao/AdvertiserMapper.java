package ai.houyi.zhuque.dao;

import ai.houyi.zhuque.dao.model.Advertiser;
import ai.houyi.zhuque.dao.model.AdvertiserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdvertiserMapper {
    long countByExample(AdvertiserExample example);

    int deleteByExample(AdvertiserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Advertiser record);

    int insertSelective(Advertiser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table advertiser
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    Advertiser selectOneByExample(AdvertiserExample example);

    List<Advertiser> selectByExample(AdvertiserExample example);

    Advertiser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Advertiser record, @Param("example") AdvertiserExample example);

    int updateByExample(@Param("record") Advertiser record, @Param("example") AdvertiserExample example);

    int updateByPrimaryKeySelective(Advertiser record);

    int updateByPrimaryKey(Advertiser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table advertiser
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int batchInsert(@Param("list") List<Advertiser> list);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table advertiser
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int batchInsertSelective(@Param("list") List<Advertiser> list, @Param("selective") Advertiser.Column ... selective);
}