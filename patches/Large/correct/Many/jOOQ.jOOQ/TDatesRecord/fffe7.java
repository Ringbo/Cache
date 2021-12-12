diff --git a/jOOQ-test/src/org/jooq/test/oracle/generatedclasses/test/tables/records/TDatesRecord.java b/jOOQ-test/src/org/jooq/test/oracle/generatedclasses/test/tables/records/TDatesRecord.java
index 3c4fafa..bff3d13 100644
--- a/jOOQ-test/src/org/jooq/test/oracle/generatedclasses/test/tables/records/TDatesRecord.java
+++ b/jOOQ-test/src/org/jooq/test/oracle/generatedclasses/test/tables/records/TDatesRecord.java
@@ -8,14 +8,14 @@
  */
 public class TDatesRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.oracle.generatedclasses.test.tables.records.TDatesRecord> {
 
-	private static final long serialVersionUID = 71390418;
+	private static final long serialVersionUID = 2123150840;
 
 	/**
 	 * An uncommented item
 	 * 
 	 * PRIMARY KEY
 	 */
-	public void setId(java.math.BigDecimal value) {
+	public void setId(java.lang.Integer value) {
 		setValue(org.jooq.test.oracle.generatedclasses.test.tables.TDates.T_DATES.ID, value);
 	}
 
@@ -24,7 +24,7 @@
 	 * 
 	 * PRIMARY KEY
 	 */
-	public java.math.BigDecimal getId() {
+	public java.lang.Integer getId() {
 		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.TDates.T_DATES.ID);
 	}
 
