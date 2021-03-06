/**
 * This file is part of mycollab-services.
 *
 * mycollab-services is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * mycollab-services is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with mycollab-services.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.mycollab.form.domain;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("ucd")
public class FormSectionFieldExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table m_form_section_field
     *
     * @mbg.generated Sat Sep 24 08:44:36 ICT 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table m_form_section_field
     *
     * @mbg.generated Sat Sep 24 08:44:36 ICT 2016
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table m_form_section_field
     *
     * @mbg.generated Sat Sep 24 08:44:36 ICT 2016
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_form_section_field
     *
     * @mbg.generated Sat Sep 24 08:44:36 ICT 2016
     */
    public FormSectionFieldExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_form_section_field
     *
     * @mbg.generated Sat Sep 24 08:44:36 ICT 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_form_section_field
     *
     * @mbg.generated Sat Sep 24 08:44:36 ICT 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_form_section_field
     *
     * @mbg.generated Sat Sep 24 08:44:36 ICT 2016
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_form_section_field
     *
     * @mbg.generated Sat Sep 24 08:44:36 ICT 2016
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_form_section_field
     *
     * @mbg.generated Sat Sep 24 08:44:36 ICT 2016
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_form_section_field
     *
     * @mbg.generated Sat Sep 24 08:44:36 ICT 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_form_section_field
     *
     * @mbg.generated Sat Sep 24 08:44:36 ICT 2016
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_form_section_field
     *
     * @mbg.generated Sat Sep 24 08:44:36 ICT 2016
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_form_section_field
     *
     * @mbg.generated Sat Sep 24 08:44:36 ICT 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_form_section_field
     *
     * @mbg.generated Sat Sep 24 08:44:36 ICT 2016
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table m_form_section_field
     *
     * @mbg.generated Sat Sep 24 08:44:36 ICT 2016
     */
    @SuppressWarnings("ucd")
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSectionidIsNull() {
            addCriterion("sectionId is null");
            return (Criteria) this;
        }

        public Criteria andSectionidIsNotNull() {
            addCriterion("sectionId is not null");
            return (Criteria) this;
        }

        public Criteria andSectionidEqualTo(Integer value) {
            addCriterion("sectionId =", value, "sectionid");
            return (Criteria) this;
        }

        public Criteria andSectionidNotEqualTo(Integer value) {
            addCriterion("sectionId <>", value, "sectionid");
            return (Criteria) this;
        }

        public Criteria andSectionidGreaterThan(Integer value) {
            addCriterion("sectionId >", value, "sectionid");
            return (Criteria) this;
        }

        public Criteria andSectionidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sectionId >=", value, "sectionid");
            return (Criteria) this;
        }

        public Criteria andSectionidLessThan(Integer value) {
            addCriterion("sectionId <", value, "sectionid");
            return (Criteria) this;
        }

        public Criteria andSectionidLessThanOrEqualTo(Integer value) {
            addCriterion("sectionId <=", value, "sectionid");
            return (Criteria) this;
        }

        public Criteria andSectionidIn(List<Integer> values) {
            addCriterion("sectionId in", values, "sectionid");
            return (Criteria) this;
        }

        public Criteria andSectionidNotIn(List<Integer> values) {
            addCriterion("sectionId not in", values, "sectionid");
            return (Criteria) this;
        }

        public Criteria andSectionidBetween(Integer value1, Integer value2) {
            addCriterion("sectionId between", value1, value2, "sectionid");
            return (Criteria) this;
        }

        public Criteria andSectionidNotBetween(Integer value1, Integer value2) {
            addCriterion("sectionId not between", value1, value2, "sectionid");
            return (Criteria) this;
        }

        public Criteria andIsmandatoryIsNull() {
            addCriterion("isMandatory is null");
            return (Criteria) this;
        }

        public Criteria andIsmandatoryIsNotNull() {
            addCriterion("isMandatory is not null");
            return (Criteria) this;
        }

        public Criteria andIsmandatoryEqualTo(Boolean value) {
            addCriterion("isMandatory =", value, "ismandatory");
            return (Criteria) this;
        }

        public Criteria andIsmandatoryNotEqualTo(Boolean value) {
            addCriterion("isMandatory <>", value, "ismandatory");
            return (Criteria) this;
        }

        public Criteria andIsmandatoryGreaterThan(Boolean value) {
            addCriterion("isMandatory >", value, "ismandatory");
            return (Criteria) this;
        }

        public Criteria andIsmandatoryGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isMandatory >=", value, "ismandatory");
            return (Criteria) this;
        }

        public Criteria andIsmandatoryLessThan(Boolean value) {
            addCriterion("isMandatory <", value, "ismandatory");
            return (Criteria) this;
        }

        public Criteria andIsmandatoryLessThanOrEqualTo(Boolean value) {
            addCriterion("isMandatory <=", value, "ismandatory");
            return (Criteria) this;
        }

        public Criteria andIsmandatoryIn(List<Boolean> values) {
            addCriterion("isMandatory in", values, "ismandatory");
            return (Criteria) this;
        }

        public Criteria andIsmandatoryNotIn(List<Boolean> values) {
            addCriterion("isMandatory not in", values, "ismandatory");
            return (Criteria) this;
        }

        public Criteria andIsmandatoryBetween(Boolean value1, Boolean value2) {
            addCriterion("isMandatory between", value1, value2, "ismandatory");
            return (Criteria) this;
        }

        public Criteria andIsmandatoryNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isMandatory not between", value1, value2, "ismandatory");
            return (Criteria) this;
        }

        public Criteria andFieldindexIsNull() {
            addCriterion("fieldIndex is null");
            return (Criteria) this;
        }

        public Criteria andFieldindexIsNotNull() {
            addCriterion("fieldIndex is not null");
            return (Criteria) this;
        }

        public Criteria andFieldindexEqualTo(Integer value) {
            addCriterion("fieldIndex =", value, "fieldindex");
            return (Criteria) this;
        }

        public Criteria andFieldindexNotEqualTo(Integer value) {
            addCriterion("fieldIndex <>", value, "fieldindex");
            return (Criteria) this;
        }

        public Criteria andFieldindexGreaterThan(Integer value) {
            addCriterion("fieldIndex >", value, "fieldindex");
            return (Criteria) this;
        }

        public Criteria andFieldindexGreaterThanOrEqualTo(Integer value) {
            addCriterion("fieldIndex >=", value, "fieldindex");
            return (Criteria) this;
        }

        public Criteria andFieldindexLessThan(Integer value) {
            addCriterion("fieldIndex <", value, "fieldindex");
            return (Criteria) this;
        }

        public Criteria andFieldindexLessThanOrEqualTo(Integer value) {
            addCriterion("fieldIndex <=", value, "fieldindex");
            return (Criteria) this;
        }

        public Criteria andFieldindexIn(List<Integer> values) {
            addCriterion("fieldIndex in", values, "fieldindex");
            return (Criteria) this;
        }

        public Criteria andFieldindexNotIn(List<Integer> values) {
            addCriterion("fieldIndex not in", values, "fieldindex");
            return (Criteria) this;
        }

        public Criteria andFieldindexBetween(Integer value1, Integer value2) {
            addCriterion("fieldIndex between", value1, value2, "fieldindex");
            return (Criteria) this;
        }

        public Criteria andFieldindexNotBetween(Integer value1, Integer value2) {
            addCriterion("fieldIndex not between", value1, value2, "fieldindex");
            return (Criteria) this;
        }

        public Criteria andDisplaynameIsNull() {
            addCriterion("displayName is null");
            return (Criteria) this;
        }

        public Criteria andDisplaynameIsNotNull() {
            addCriterion("displayName is not null");
            return (Criteria) this;
        }

        public Criteria andDisplaynameEqualTo(String value) {
            addCriterion("displayName =", value, "displayname");
            return (Criteria) this;
        }

        public Criteria andDisplaynameNotEqualTo(String value) {
            addCriterion("displayName <>", value, "displayname");
            return (Criteria) this;
        }

        public Criteria andDisplaynameGreaterThan(String value) {
            addCriterion("displayName >", value, "displayname");
            return (Criteria) this;
        }

        public Criteria andDisplaynameGreaterThanOrEqualTo(String value) {
            addCriterion("displayName >=", value, "displayname");
            return (Criteria) this;
        }

        public Criteria andDisplaynameLessThan(String value) {
            addCriterion("displayName <", value, "displayname");
            return (Criteria) this;
        }

        public Criteria andDisplaynameLessThanOrEqualTo(String value) {
            addCriterion("displayName <=", value, "displayname");
            return (Criteria) this;
        }

        public Criteria andDisplaynameLike(String value) {
            addCriterion("displayName like", value, "displayname");
            return (Criteria) this;
        }

        public Criteria andDisplaynameNotLike(String value) {
            addCriterion("displayName not like", value, "displayname");
            return (Criteria) this;
        }

        public Criteria andDisplaynameIn(List<String> values) {
            addCriterion("displayName in", values, "displayname");
            return (Criteria) this;
        }

        public Criteria andDisplaynameNotIn(List<String> values) {
            addCriterion("displayName not in", values, "displayname");
            return (Criteria) this;
        }

        public Criteria andDisplaynameBetween(String value1, String value2) {
            addCriterion("displayName between", value1, value2, "displayname");
            return (Criteria) this;
        }

        public Criteria andDisplaynameNotBetween(String value1, String value2) {
            addCriterion("displayName not between", value1, value2, "displayname");
            return (Criteria) this;
        }

        public Criteria andFieldformatIsNull() {
            addCriterion("fieldFormat is null");
            return (Criteria) this;
        }

        public Criteria andFieldformatIsNotNull() {
            addCriterion("fieldFormat is not null");
            return (Criteria) this;
        }

        public Criteria andFieldformatEqualTo(String value) {
            addCriterion("fieldFormat =", value, "fieldformat");
            return (Criteria) this;
        }

        public Criteria andFieldformatNotEqualTo(String value) {
            addCriterion("fieldFormat <>", value, "fieldformat");
            return (Criteria) this;
        }

        public Criteria andFieldformatGreaterThan(String value) {
            addCriterion("fieldFormat >", value, "fieldformat");
            return (Criteria) this;
        }

        public Criteria andFieldformatGreaterThanOrEqualTo(String value) {
            addCriterion("fieldFormat >=", value, "fieldformat");
            return (Criteria) this;
        }

        public Criteria andFieldformatLessThan(String value) {
            addCriterion("fieldFormat <", value, "fieldformat");
            return (Criteria) this;
        }

        public Criteria andFieldformatLessThanOrEqualTo(String value) {
            addCriterion("fieldFormat <=", value, "fieldformat");
            return (Criteria) this;
        }

        public Criteria andFieldformatLike(String value) {
            addCriterion("fieldFormat like", value, "fieldformat");
            return (Criteria) this;
        }

        public Criteria andFieldformatNotLike(String value) {
            addCriterion("fieldFormat not like", value, "fieldformat");
            return (Criteria) this;
        }

        public Criteria andFieldformatIn(List<String> values) {
            addCriterion("fieldFormat in", values, "fieldformat");
            return (Criteria) this;
        }

        public Criteria andFieldformatNotIn(List<String> values) {
            addCriterion("fieldFormat not in", values, "fieldformat");
            return (Criteria) this;
        }

        public Criteria andFieldformatBetween(String value1, String value2) {
            addCriterion("fieldFormat between", value1, value2, "fieldformat");
            return (Criteria) this;
        }

        public Criteria andFieldformatNotBetween(String value1, String value2) {
            addCriterion("fieldFormat not between", value1, value2, "fieldformat");
            return (Criteria) this;
        }

        public Criteria andFieldnameIsNull() {
            addCriterion("fieldname is null");
            return (Criteria) this;
        }

        public Criteria andFieldnameIsNotNull() {
            addCriterion("fieldname is not null");
            return (Criteria) this;
        }

        public Criteria andFieldnameEqualTo(String value) {
            addCriterion("fieldname =", value, "fieldname");
            return (Criteria) this;
        }

        public Criteria andFieldnameNotEqualTo(String value) {
            addCriterion("fieldname <>", value, "fieldname");
            return (Criteria) this;
        }

        public Criteria andFieldnameGreaterThan(String value) {
            addCriterion("fieldname >", value, "fieldname");
            return (Criteria) this;
        }

        public Criteria andFieldnameGreaterThanOrEqualTo(String value) {
            addCriterion("fieldname >=", value, "fieldname");
            return (Criteria) this;
        }

        public Criteria andFieldnameLessThan(String value) {
            addCriterion("fieldname <", value, "fieldname");
            return (Criteria) this;
        }

        public Criteria andFieldnameLessThanOrEqualTo(String value) {
            addCriterion("fieldname <=", value, "fieldname");
            return (Criteria) this;
        }

        public Criteria andFieldnameLike(String value) {
            addCriterion("fieldname like", value, "fieldname");
            return (Criteria) this;
        }

        public Criteria andFieldnameNotLike(String value) {
            addCriterion("fieldname not like", value, "fieldname");
            return (Criteria) this;
        }

        public Criteria andFieldnameIn(List<String> values) {
            addCriterion("fieldname in", values, "fieldname");
            return (Criteria) this;
        }

        public Criteria andFieldnameNotIn(List<String> values) {
            addCriterion("fieldname not in", values, "fieldname");
            return (Criteria) this;
        }

        public Criteria andFieldnameBetween(String value1, String value2) {
            addCriterion("fieldname between", value1, value2, "fieldname");
            return (Criteria) this;
        }

        public Criteria andFieldnameNotBetween(String value1, String value2) {
            addCriterion("fieldname not between", value1, value2, "fieldname");
            return (Criteria) this;
        }

        public Criteria andFieldtypeIsNull() {
            addCriterion("fieldType is null");
            return (Criteria) this;
        }

        public Criteria andFieldtypeIsNotNull() {
            addCriterion("fieldType is not null");
            return (Criteria) this;
        }

        public Criteria andFieldtypeEqualTo(String value) {
            addCriterion("fieldType =", value, "fieldtype");
            return (Criteria) this;
        }

        public Criteria andFieldtypeNotEqualTo(String value) {
            addCriterion("fieldType <>", value, "fieldtype");
            return (Criteria) this;
        }

        public Criteria andFieldtypeGreaterThan(String value) {
            addCriterion("fieldType >", value, "fieldtype");
            return (Criteria) this;
        }

        public Criteria andFieldtypeGreaterThanOrEqualTo(String value) {
            addCriterion("fieldType >=", value, "fieldtype");
            return (Criteria) this;
        }

        public Criteria andFieldtypeLessThan(String value) {
            addCriterion("fieldType <", value, "fieldtype");
            return (Criteria) this;
        }

        public Criteria andFieldtypeLessThanOrEqualTo(String value) {
            addCriterion("fieldType <=", value, "fieldtype");
            return (Criteria) this;
        }

        public Criteria andFieldtypeLike(String value) {
            addCriterion("fieldType like", value, "fieldtype");
            return (Criteria) this;
        }

        public Criteria andFieldtypeNotLike(String value) {
            addCriterion("fieldType not like", value, "fieldtype");
            return (Criteria) this;
        }

        public Criteria andFieldtypeIn(List<String> values) {
            addCriterion("fieldType in", values, "fieldtype");
            return (Criteria) this;
        }

        public Criteria andFieldtypeNotIn(List<String> values) {
            addCriterion("fieldType not in", values, "fieldtype");
            return (Criteria) this;
        }

        public Criteria andFieldtypeBetween(String value1, String value2) {
            addCriterion("fieldType between", value1, value2, "fieldtype");
            return (Criteria) this;
        }

        public Criteria andFieldtypeNotBetween(String value1, String value2) {
            addCriterion("fieldType not between", value1, value2, "fieldtype");
            return (Criteria) this;
        }

        public Criteria andIsrequiredIsNull() {
            addCriterion("isRequired is null");
            return (Criteria) this;
        }

        public Criteria andIsrequiredIsNotNull() {
            addCriterion("isRequired is not null");
            return (Criteria) this;
        }

        public Criteria andIsrequiredEqualTo(Boolean value) {
            addCriterion("isRequired =", value, "isrequired");
            return (Criteria) this;
        }

        public Criteria andIsrequiredNotEqualTo(Boolean value) {
            addCriterion("isRequired <>", value, "isrequired");
            return (Criteria) this;
        }

        public Criteria andIsrequiredGreaterThan(Boolean value) {
            addCriterion("isRequired >", value, "isrequired");
            return (Criteria) this;
        }

        public Criteria andIsrequiredGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isRequired >=", value, "isrequired");
            return (Criteria) this;
        }

        public Criteria andIsrequiredLessThan(Boolean value) {
            addCriterion("isRequired <", value, "isrequired");
            return (Criteria) this;
        }

        public Criteria andIsrequiredLessThanOrEqualTo(Boolean value) {
            addCriterion("isRequired <=", value, "isrequired");
            return (Criteria) this;
        }

        public Criteria andIsrequiredIn(List<Boolean> values) {
            addCriterion("isRequired in", values, "isrequired");
            return (Criteria) this;
        }

        public Criteria andIsrequiredNotIn(List<Boolean> values) {
            addCriterion("isRequired not in", values, "isrequired");
            return (Criteria) this;
        }

        public Criteria andIsrequiredBetween(Boolean value1, Boolean value2) {
            addCriterion("isRequired between", value1, value2, "isrequired");
            return (Criteria) this;
        }

        public Criteria andIsrequiredNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isRequired not between", value1, value2, "isrequired");
            return (Criteria) this;
        }

        public Criteria andIscustomIsNull() {
            addCriterion("isCustom is null");
            return (Criteria) this;
        }

        public Criteria andIscustomIsNotNull() {
            addCriterion("isCustom is not null");
            return (Criteria) this;
        }

        public Criteria andIscustomEqualTo(Boolean value) {
            addCriterion("isCustom =", value, "iscustom");
            return (Criteria) this;
        }

        public Criteria andIscustomNotEqualTo(Boolean value) {
            addCriterion("isCustom <>", value, "iscustom");
            return (Criteria) this;
        }

        public Criteria andIscustomGreaterThan(Boolean value) {
            addCriterion("isCustom >", value, "iscustom");
            return (Criteria) this;
        }

        public Criteria andIscustomGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isCustom >=", value, "iscustom");
            return (Criteria) this;
        }

        public Criteria andIscustomLessThan(Boolean value) {
            addCriterion("isCustom <", value, "iscustom");
            return (Criteria) this;
        }

        public Criteria andIscustomLessThanOrEqualTo(Boolean value) {
            addCriterion("isCustom <=", value, "iscustom");
            return (Criteria) this;
        }

        public Criteria andIscustomIn(List<Boolean> values) {
            addCriterion("isCustom in", values, "iscustom");
            return (Criteria) this;
        }

        public Criteria andIscustomNotIn(List<Boolean> values) {
            addCriterion("isCustom not in", values, "iscustom");
            return (Criteria) this;
        }

        public Criteria andIscustomBetween(Boolean value1, Boolean value2) {
            addCriterion("isCustom between", value1, value2, "iscustom");
            return (Criteria) this;
        }

        public Criteria andIscustomNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isCustom not between", value1, value2, "iscustom");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table m_form_section_field
     *
     * @mbg.generated do_not_delete_during_merge Sat Sep 24 08:44:36 ICT 2016
     */
    @SuppressWarnings("ucd")
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table m_form_section_field
     *
     * @mbg.generated Sat Sep 24 08:44:36 ICT 2016
     */
    @SuppressWarnings("ucd")
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}