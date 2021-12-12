diff --git a/jodd-mail/src/test/java/jodd/mail/EmailFilterTest.java b/jodd-mail/src/test/java/jodd/mail/EmailFilterTest.java
index 2b50df9..020b060 100644
--- a/jodd-mail/src/test/java/jodd/mail/EmailFilterTest.java
+++ b/jodd-mail/src/test/java/jodd/mail/EmailFilterTest.java
@@ -170,13 +170,13 @@
 	@Test
 	void testReceivedDate() {
 		final EmailFilter emailFilter = EmailFilter.filter()
-			.receivedDate(EmailFilter.Operator.EQ, 1524575533757)
-			.sentDate(EmailFilter.Operator.GT, 1524575533757);
+			.receivedDate(EmailFilter.Operator.EQ, 1524575533757L)
+			.sentDate(EmailFilter.Operator.GT, 1524575533757L);
 
 		final SearchTerm expected =
 			new AndTerm(
-				new ReceivedDateTerm(3, new Date(1524575533757)),
-				new SentDateTerm(5, new Date(1524575533757))
+				new ReceivedDateTerm(3, new Date(1524575533757L)),
+				new SentDateTerm(5, new Date(1524575533757L))
 			);
 
 		assertEquals(expected, emailFilter.searchTerm);
