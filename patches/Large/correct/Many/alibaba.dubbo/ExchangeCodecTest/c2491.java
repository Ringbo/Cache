diff --git a/dubbo-remoting/dubbo-remoting-api/src/test/java/com/alibaba/dubbo/remoting/codec/ExchangeCodecTest.java b/dubbo-remoting/dubbo-remoting-api/src/test/java/com/alibaba/dubbo/remoting/codec/ExchangeCodecTest.java
index ac0802b..0f36da4 100644
--- a/dubbo-remoting/dubbo-remoting-api/src/test/java/com/alibaba/dubbo/remoting/codec/ExchangeCodecTest.java
+++ b/dubbo-remoting/dubbo-remoting-api/src/test/java/com/alibaba/dubbo/remoting/codec/ExchangeCodecTest.java
@@ -119,7 +119,7 @@
 
     @Test
     public void test_Decode_Error_Length() throws IOException {
-        byte[] header = new byte[]{MAGIC_HIGH, MAGIC_LOW, 0x20, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
+        byte[] header = new byte[]{MAGIC_HIGH, MAGIC_LOW, 0x02, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
         Person person = new Person();
         byte[] request = getRequestBytes(person, header);
 
@@ -135,7 +135,7 @@
     @Test
     public void test_Decode_Error_Response_Object() throws IOException {
         //00000010-response/oneway/hearbeat=true |20-stats=ok|id=0|length=0
-        byte[] header = new byte[]{MAGIC_HIGH, MAGIC_LOW, 0x20, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
+        byte[] header = new byte[]{MAGIC_HIGH, MAGIC_LOW, 0x02, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
         Person person = new Person();
         byte[] request = getRequestBytes(person, header);
         //bad object
@@ -208,7 +208,7 @@
     @Test
     public void test_Decode_Return_Request_Event_Object() throws IOException {
         //|10011111|20-stats=ok|id=0|length=0
-        byte[] header = new byte[]{MAGIC_HIGH, MAGIC_LOW, (byte) 0xff, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
+        byte[] header = new byte[]{MAGIC_HIGH, MAGIC_LOW, (byte) 0xe2, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
         Person person = new Person();
         byte[] request = getRequestBytes(person, header);
 
@@ -223,7 +223,7 @@
     @Test
     public void test_Decode_Return_Request_Event_String() throws IOException {
         //|10011111|20-stats=ok|id=0|length=0
-        byte[] header = new byte[]{MAGIC_HIGH, MAGIC_LOW, (byte) 0xff, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
+        byte[] header = new byte[]{MAGIC_HIGH, MAGIC_LOW, (byte) 0xe2, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
         String event = Request.READONLY_EVENT;
         byte[] request = getRequestBytes(event, header);
 
@@ -238,7 +238,7 @@
     @Test
     public void test_Decode_Return_Request_Heartbeat_Object() throws IOException {
         //|10011111|20-stats=ok|id=0|length=0
-        byte[] header = new byte[]{MAGIC_HIGH, MAGIC_LOW, (byte) 0xff, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
+        byte[] header = new byte[]{MAGIC_HIGH, MAGIC_LOW, (byte) 0xe2, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
         byte[] request = getRequestBytes(null, header);
         Request obj = (Request) decode(request);
         Assert.assertEquals(null, obj.getData());
@@ -251,7 +251,7 @@
     @Test
     public void test_Decode_Return_Request_Object() throws IOException {
         //|10011111|20-stats=ok|id=0|length=0
-        byte[] header = new byte[]{MAGIC_HIGH, MAGIC_LOW, (byte) 0xdf, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
+        byte[] header = new byte[]{MAGIC_HIGH, MAGIC_LOW, (byte) 0xe2, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
         Person person = new Person();
         byte[] request = getRequestBytes(person, header);
 
@@ -266,7 +266,7 @@
     @Test
     public void test_Decode_Error_Request_Object() throws IOException {
         //00000010-response/oneway/hearbeat=true |20-stats=ok|id=0|length=0
-        byte[] header = new byte[]{MAGIC_HIGH, MAGIC_LOW, (byte) 0xdf, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
+        byte[] header = new byte[]{MAGIC_HIGH, MAGIC_LOW, (byte) 0xe2, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
         Person person = new Person();
         byte[] request = getRequestBytes(person, header);
         //bad object
@@ -281,7 +281,7 @@
     @Test
     public void test_Header_Response_NoSerializationFlag() throws IOException {
         //00000010-response/oneway/hearbeat=false/noset |20-stats=ok|id=0|length=0
-        byte[] header = new byte[]{MAGIC_HIGH, MAGIC_LOW, 0, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
+        byte[] header = new byte[]{MAGIC_HIGH, MAGIC_LOW, (byte) 0x02, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
         Person person = new Person();
         byte[] request = getRequestBytes(person, header);
 
@@ -294,7 +294,7 @@
     @Test
     public void test_Header_Response_Heartbeat() throws IOException {
         //00000010-response/oneway/hearbeat=true |20-stats=ok|id=0|length=0
-        byte[] header = new byte[]{MAGIC_HIGH, MAGIC_LOW, 0x20, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
+        byte[] header = new byte[]{MAGIC_HIGH, MAGIC_LOW, 0x02, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
         Person person = new Person();
         byte[] request = getRequestBytes(person, header);
 
