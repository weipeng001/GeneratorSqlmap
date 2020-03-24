package com.mybatis.po;

import java.util.ArrayList;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andFdsgdsgIsNull() {
            addCriterion("fdsgdsg is null");
            return (Criteria) this;
        }

        public Criteria andFdsgdsgIsNotNull() {
            addCriterion("fdsgdsg is not null");
            return (Criteria) this;
        }

        public Criteria andFdsgdsgEqualTo(String value) {
            addCriterion("fdsgdsg =", value, "fdsgdsg");
            return (Criteria) this;
        }

        public Criteria andFdsgdsgNotEqualTo(String value) {
            addCriterion("fdsgdsg <>", value, "fdsgdsg");
            return (Criteria) this;
        }

        public Criteria andFdsgdsgGreaterThan(String value) {
            addCriterion("fdsgdsg >", value, "fdsgdsg");
            return (Criteria) this;
        }

        public Criteria andFdsgdsgGreaterThanOrEqualTo(String value) {
            addCriterion("fdsgdsg >=", value, "fdsgdsg");
            return (Criteria) this;
        }

        public Criteria andFdsgdsgLessThan(String value) {
            addCriterion("fdsgdsg <", value, "fdsgdsg");
            return (Criteria) this;
        }

        public Criteria andFdsgdsgLessThanOrEqualTo(String value) {
            addCriterion("fdsgdsg <=", value, "fdsgdsg");
            return (Criteria) this;
        }

        public Criteria andFdsgdsgLike(String value) {
            addCriterion("fdsgdsg like", value, "fdsgdsg");
            return (Criteria) this;
        }

        public Criteria andFdsgdsgNotLike(String value) {
            addCriterion("fdsgdsg not like", value, "fdsgdsg");
            return (Criteria) this;
        }

        public Criteria andFdsgdsgIn(List<String> values) {
            addCriterion("fdsgdsg in", values, "fdsgdsg");
            return (Criteria) this;
        }

        public Criteria andFdsgdsgNotIn(List<String> values) {
            addCriterion("fdsgdsg not in", values, "fdsgdsg");
            return (Criteria) this;
        }

        public Criteria andFdsgdsgBetween(String value1, String value2) {
            addCriterion("fdsgdsg between", value1, value2, "fdsgdsg");
            return (Criteria) this;
        }

        public Criteria andFdsgdsgNotBetween(String value1, String value2) {
            addCriterion("fdsgdsg not between", value1, value2, "fdsgdsg");
            return (Criteria) this;
        }

        public Criteria andFsdfIsNull() {
            addCriterion("fsdf is null");
            return (Criteria) this;
        }

        public Criteria andFsdfIsNotNull() {
            addCriterion("fsdf is not null");
            return (Criteria) this;
        }

        public Criteria andFsdfEqualTo(String value) {
            addCriterion("fsdf =", value, "fsdf");
            return (Criteria) this;
        }

        public Criteria andFsdfNotEqualTo(String value) {
            addCriterion("fsdf <>", value, "fsdf");
            return (Criteria) this;
        }

        public Criteria andFsdfGreaterThan(String value) {
            addCriterion("fsdf >", value, "fsdf");
            return (Criteria) this;
        }

        public Criteria andFsdfGreaterThanOrEqualTo(String value) {
            addCriterion("fsdf >=", value, "fsdf");
            return (Criteria) this;
        }

        public Criteria andFsdfLessThan(String value) {
            addCriterion("fsdf <", value, "fsdf");
            return (Criteria) this;
        }

        public Criteria andFsdfLessThanOrEqualTo(String value) {
            addCriterion("fsdf <=", value, "fsdf");
            return (Criteria) this;
        }

        public Criteria andFsdfLike(String value) {
            addCriterion("fsdf like", value, "fsdf");
            return (Criteria) this;
        }

        public Criteria andFsdfNotLike(String value) {
            addCriterion("fsdf not like", value, "fsdf");
            return (Criteria) this;
        }

        public Criteria andFsdfIn(List<String> values) {
            addCriterion("fsdf in", values, "fsdf");
            return (Criteria) this;
        }

        public Criteria andFsdfNotIn(List<String> values) {
            addCriterion("fsdf not in", values, "fsdf");
            return (Criteria) this;
        }

        public Criteria andFsdfBetween(String value1, String value2) {
            addCriterion("fsdf between", value1, value2, "fsdf");
            return (Criteria) this;
        }

        public Criteria andFsdfNotBetween(String value1, String value2) {
            addCriterion("fsdf not between", value1, value2, "fsdf");
            return (Criteria) this;
        }

        public Criteria andFdgIsNull() {
            addCriterion("fdg is null");
            return (Criteria) this;
        }

        public Criteria andFdgIsNotNull() {
            addCriterion("fdg is not null");
            return (Criteria) this;
        }

        public Criteria andFdgEqualTo(String value) {
            addCriterion("fdg =", value, "fdg");
            return (Criteria) this;
        }

        public Criteria andFdgNotEqualTo(String value) {
            addCriterion("fdg <>", value, "fdg");
            return (Criteria) this;
        }

        public Criteria andFdgGreaterThan(String value) {
            addCriterion("fdg >", value, "fdg");
            return (Criteria) this;
        }

        public Criteria andFdgGreaterThanOrEqualTo(String value) {
            addCriterion("fdg >=", value, "fdg");
            return (Criteria) this;
        }

        public Criteria andFdgLessThan(String value) {
            addCriterion("fdg <", value, "fdg");
            return (Criteria) this;
        }

        public Criteria andFdgLessThanOrEqualTo(String value) {
            addCriterion("fdg <=", value, "fdg");
            return (Criteria) this;
        }

        public Criteria andFdgLike(String value) {
            addCriterion("fdg like", value, "fdg");
            return (Criteria) this;
        }

        public Criteria andFdgNotLike(String value) {
            addCriterion("fdg not like", value, "fdg");
            return (Criteria) this;
        }

        public Criteria andFdgIn(List<String> values) {
            addCriterion("fdg in", values, "fdg");
            return (Criteria) this;
        }

        public Criteria andFdgNotIn(List<String> values) {
            addCriterion("fdg not in", values, "fdg");
            return (Criteria) this;
        }

        public Criteria andFdgBetween(String value1, String value2) {
            addCriterion("fdg between", value1, value2, "fdg");
            return (Criteria) this;
        }

        public Criteria andFdgNotBetween(String value1, String value2) {
            addCriterion("fdg not between", value1, value2, "fdg");
            return (Criteria) this;
        }

        public Criteria andAsdIsNull() {
            addCriterion("asd is null");
            return (Criteria) this;
        }

        public Criteria andAsdIsNotNull() {
            addCriterion("asd is not null");
            return (Criteria) this;
        }

        public Criteria andAsdEqualTo(String value) {
            addCriterion("asd =", value, "asd");
            return (Criteria) this;
        }

        public Criteria andAsdNotEqualTo(String value) {
            addCriterion("asd <>", value, "asd");
            return (Criteria) this;
        }

        public Criteria andAsdGreaterThan(String value) {
            addCriterion("asd >", value, "asd");
            return (Criteria) this;
        }

        public Criteria andAsdGreaterThanOrEqualTo(String value) {
            addCriterion("asd >=", value, "asd");
            return (Criteria) this;
        }

        public Criteria andAsdLessThan(String value) {
            addCriterion("asd <", value, "asd");
            return (Criteria) this;
        }

        public Criteria andAsdLessThanOrEqualTo(String value) {
            addCriterion("asd <=", value, "asd");
            return (Criteria) this;
        }

        public Criteria andAsdLike(String value) {
            addCriterion("asd like", value, "asd");
            return (Criteria) this;
        }

        public Criteria andAsdNotLike(String value) {
            addCriterion("asd not like", value, "asd");
            return (Criteria) this;
        }

        public Criteria andAsdIn(List<String> values) {
            addCriterion("asd in", values, "asd");
            return (Criteria) this;
        }

        public Criteria andAsdNotIn(List<String> values) {
            addCriterion("asd not in", values, "asd");
            return (Criteria) this;
        }

        public Criteria andAsdBetween(String value1, String value2) {
            addCriterion("asd between", value1, value2, "asd");
            return (Criteria) this;
        }

        public Criteria andAsdNotBetween(String value1, String value2) {
            addCriterion("asd not between", value1, value2, "asd");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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