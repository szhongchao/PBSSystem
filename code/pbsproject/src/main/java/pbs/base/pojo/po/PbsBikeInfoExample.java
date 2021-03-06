package pbs.base.pojo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PbsBikeInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PbsBikeInfoExample() {
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andBmIsNull() {
            addCriterion("BM is null");
            return (Criteria) this;
        }

        public Criteria andBmIsNotNull() {
            addCriterion("BM is not null");
            return (Criteria) this;
        }

        public Criteria andBmEqualTo(String value) {
            addCriterion("BM =", value, "bm");
            return (Criteria) this;
        }

        public Criteria andBmNotEqualTo(String value) {
            addCriterion("BM <>", value, "bm");
            return (Criteria) this;
        }

        public Criteria andBmGreaterThan(String value) {
            addCriterion("BM >", value, "bm");
            return (Criteria) this;
        }

        public Criteria andBmGreaterThanOrEqualTo(String value) {
            addCriterion("BM >=", value, "bm");
            return (Criteria) this;
        }

        public Criteria andBmLessThan(String value) {
            addCriterion("BM <", value, "bm");
            return (Criteria) this;
        }

        public Criteria andBmLessThanOrEqualTo(String value) {
            addCriterion("BM <=", value, "bm");
            return (Criteria) this;
        }

        public Criteria andBmLike(String value) {
            addCriterion("BM like", value, "bm");
            return (Criteria) this;
        }

        public Criteria andBmNotLike(String value) {
            addCriterion("BM not like", value, "bm");
            return (Criteria) this;
        }

        public Criteria andBmIn(List<String> values) {
            addCriterion("BM in", values, "bm");
            return (Criteria) this;
        }

        public Criteria andBmNotIn(List<String> values) {
            addCriterion("BM not in", values, "bm");
            return (Criteria) this;
        }

        public Criteria andBmBetween(String value1, String value2) {
            addCriterion("BM between", value1, value2, "bm");
            return (Criteria) this;
        }

        public Criteria andBmNotBetween(String value1, String value2) {
            addCriterion("BM not between", value1, value2, "bm");
            return (Criteria) this;
        }

        public Criteria andRqIsNull() {
            addCriterion("RQ is null");
            return (Criteria) this;
        }

        public Criteria andRqIsNotNull() {
            addCriterion("RQ is not null");
            return (Criteria) this;
        }

        public Criteria andRqEqualTo(Date value) {
            addCriterion("RQ =", value, "rq");
            return (Criteria) this;
        }

        public Criteria andRqNotEqualTo(Date value) {
            addCriterion("RQ <>", value, "rq");
            return (Criteria) this;
        }

        public Criteria andRqGreaterThan(Date value) {
            addCriterion("RQ >", value, "rq");
            return (Criteria) this;
        }

        public Criteria andRqGreaterThanOrEqualTo(Date value) {
            addCriterion("RQ >=", value, "rq");
            return (Criteria) this;
        }

        public Criteria andRqLessThan(Date value) {
            addCriterion("RQ <", value, "rq");
            return (Criteria) this;
        }

        public Criteria andRqLessThanOrEqualTo(Date value) {
            addCriterion("RQ <=", value, "rq");
            return (Criteria) this;
        }

        public Criteria andRqIn(List<Date> values) {
            addCriterion("RQ in", values, "rq");
            return (Criteria) this;
        }

        public Criteria andRqNotIn(List<Date> values) {
            addCriterion("RQ not in", values, "rq");
            return (Criteria) this;
        }

        public Criteria andRqBetween(Date value1, Date value2) {
            addCriterion("RQ between", value1, value2, "rq");
            return (Criteria) this;
        }

        public Criteria andRqNotBetween(Date value1, Date value2) {
            addCriterion("RQ not between", value1, value2, "rq");
            return (Criteria) this;
        }

        public Criteria andCjIsNull() {
            addCriterion("CJ is null");
            return (Criteria) this;
        }

        public Criteria andCjIsNotNull() {
            addCriterion("CJ is not null");
            return (Criteria) this;
        }

        public Criteria andCjEqualTo(String value) {
            addCriterion("CJ =", value, "cj");
            return (Criteria) this;
        }

        public Criteria andCjNotEqualTo(String value) {
            addCriterion("CJ <>", value, "cj");
            return (Criteria) this;
        }

        public Criteria andCjGreaterThan(String value) {
            addCriterion("CJ >", value, "cj");
            return (Criteria) this;
        }

        public Criteria andCjGreaterThanOrEqualTo(String value) {
            addCriterion("CJ >=", value, "cj");
            return (Criteria) this;
        }

        public Criteria andCjLessThan(String value) {
            addCriterion("CJ <", value, "cj");
            return (Criteria) this;
        }

        public Criteria andCjLessThanOrEqualTo(String value) {
            addCriterion("CJ <=", value, "cj");
            return (Criteria) this;
        }

        public Criteria andCjLike(String value) {
            addCriterion("CJ like", value, "cj");
            return (Criteria) this;
        }

        public Criteria andCjNotLike(String value) {
            addCriterion("CJ not like", value, "cj");
            return (Criteria) this;
        }

        public Criteria andCjIn(List<String> values) {
            addCriterion("CJ in", values, "cj");
            return (Criteria) this;
        }

        public Criteria andCjNotIn(List<String> values) {
            addCriterion("CJ not in", values, "cj");
            return (Criteria) this;
        }

        public Criteria andCjBetween(String value1, String value2) {
            addCriterion("CJ between", value1, value2, "cj");
            return (Criteria) this;
        }

        public Criteria andCjNotBetween(String value1, String value2) {
            addCriterion("CJ not between", value1, value2, "cj");
            return (Criteria) this;
        }

        public Criteria andZtIsNull() {
            addCriterion("ZT is null");
            return (Criteria) this;
        }

        public Criteria andZtIsNotNull() {
            addCriterion("ZT is not null");
            return (Criteria) this;
        }

        public Criteria andZtEqualTo(String value) {
            addCriterion("ZT =", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtNotEqualTo(String value) {
            addCriterion("ZT <>", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtGreaterThan(String value) {
            addCriterion("ZT >", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtGreaterThanOrEqualTo(String value) {
            addCriterion("ZT >=", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtLessThan(String value) {
            addCriterion("ZT <", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtLessThanOrEqualTo(String value) {
            addCriterion("ZT <=", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtLike(String value) {
            addCriterion("ZT like", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtNotLike(String value) {
            addCriterion("ZT not like", value, "zt");
            return (Criteria) this;
        }

        public Criteria andZtIn(List<String> values) {
            addCriterion("ZT in", values, "zt");
            return (Criteria) this;
        }

        public Criteria andZtNotIn(List<String> values) {
            addCriterion("ZT not in", values, "zt");
            return (Criteria) this;
        }

        public Criteria andZtBetween(String value1, String value2) {
            addCriterion("ZT between", value1, value2, "zt");
            return (Criteria) this;
        }

        public Criteria andZtNotBetween(String value1, String value2) {
            addCriterion("ZT not between", value1, value2, "zt");
            return (Criteria) this;
        }

        public Criteria andDtIsNull() {
            addCriterion("DT is null");
            return (Criteria) this;
        }

        public Criteria andDtIsNotNull() {
            addCriterion("DT is not null");
            return (Criteria) this;
        }

        public Criteria andDtEqualTo(String value) {
            addCriterion("DT =", value, "dt");
            return (Criteria) this;
        }

        public Criteria andDtNotEqualTo(String value) {
            addCriterion("DT <>", value, "dt");
            return (Criteria) this;
        }

        public Criteria andDtGreaterThan(String value) {
            addCriterion("DT >", value, "dt");
            return (Criteria) this;
        }

        public Criteria andDtGreaterThanOrEqualTo(String value) {
            addCriterion("DT >=", value, "dt");
            return (Criteria) this;
        }

        public Criteria andDtLessThan(String value) {
            addCriterion("DT <", value, "dt");
            return (Criteria) this;
        }

        public Criteria andDtLessThanOrEqualTo(String value) {
            addCriterion("DT <=", value, "dt");
            return (Criteria) this;
        }

        public Criteria andDtLike(String value) {
            addCriterion("DT like", value, "dt");
            return (Criteria) this;
        }

        public Criteria andDtNotLike(String value) {
            addCriterion("DT not like", value, "dt");
            return (Criteria) this;
        }

        public Criteria andDtIn(List<String> values) {
            addCriterion("DT in", values, "dt");
            return (Criteria) this;
        }

        public Criteria andDtNotIn(List<String> values) {
            addCriterion("DT not in", values, "dt");
            return (Criteria) this;
        }

        public Criteria andDtBetween(String value1, String value2) {
            addCriterion("DT between", value1, value2, "dt");
            return (Criteria) this;
        }

        public Criteria andDtNotBetween(String value1, String value2) {
            addCriterion("DT not between", value1, value2, "dt");
            return (Criteria) this;
        }

        public Criteria andZdIsNull() {
            addCriterion("ZD is null");
            return (Criteria) this;
        }

        public Criteria andZdIsNotNull() {
            addCriterion("ZD is not null");
            return (Criteria) this;
        }

        public Criteria andZdEqualTo(Integer value) {
            addCriterion("ZD =", value, "zd");
            return (Criteria) this;
        }

        public Criteria andZdNotEqualTo(Integer value) {
            addCriterion("ZD <>", value, "zd");
            return (Criteria) this;
        }

        public Criteria andZdGreaterThan(Integer value) {
            addCriterion("ZD >", value, "zd");
            return (Criteria) this;
        }

        public Criteria andZdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ZD >=", value, "zd");
            return (Criteria) this;
        }

        public Criteria andZdLessThan(Integer value) {
            addCriterion("ZD <", value, "zd");
            return (Criteria) this;
        }

        public Criteria andZdLessThanOrEqualTo(Integer value) {
            addCriterion("ZD <=", value, "zd");
            return (Criteria) this;
        }

        public Criteria andZdIn(List<Integer> values) {
            addCriterion("ZD in", values, "zd");
            return (Criteria) this;
        }

        public Criteria andZdNotIn(List<Integer> values) {
            addCriterion("ZD not in", values, "zd");
            return (Criteria) this;
        }

        public Criteria andZdBetween(Integer value1, Integer value2) {
            addCriterion("ZD between", value1, value2, "zd");
            return (Criteria) this;
        }

        public Criteria andZdNotBetween(Integer value1, Integer value2) {
            addCriterion("ZD not between", value1, value2, "zd");
            return (Criteria) this;
        }

        public Criteria andCzIsNull() {
            addCriterion("CZ is null");
            return (Criteria) this;
        }

        public Criteria andCzIsNotNull() {
            addCriterion("CZ is not null");
            return (Criteria) this;
        }

        public Criteria andCzEqualTo(Integer value) {
            addCriterion("CZ =", value, "cz");
            return (Criteria) this;
        }

        public Criteria andCzNotEqualTo(Integer value) {
            addCriterion("CZ <>", value, "cz");
            return (Criteria) this;
        }

        public Criteria andCzGreaterThan(Integer value) {
            addCriterion("CZ >", value, "cz");
            return (Criteria) this;
        }

        public Criteria andCzGreaterThanOrEqualTo(Integer value) {
            addCriterion("CZ >=", value, "cz");
            return (Criteria) this;
        }

        public Criteria andCzLessThan(Integer value) {
            addCriterion("CZ <", value, "cz");
            return (Criteria) this;
        }

        public Criteria andCzLessThanOrEqualTo(Integer value) {
            addCriterion("CZ <=", value, "cz");
            return (Criteria) this;
        }

        public Criteria andCzIn(List<Integer> values) {
            addCriterion("CZ in", values, "cz");
            return (Criteria) this;
        }

        public Criteria andCzNotIn(List<Integer> values) {
            addCriterion("CZ not in", values, "cz");
            return (Criteria) this;
        }

        public Criteria andCzBetween(Integer value1, Integer value2) {
            addCriterion("CZ between", value1, value2, "cz");
            return (Criteria) this;
        }

        public Criteria andCzNotBetween(Integer value1, Integer value2) {
            addCriterion("CZ not between", value1, value2, "cz");
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