diff --git a/telephony/java/android/telephony/SmsMessage.java b/telephony/java/android/telephony/SmsMessage.java
index 0746562..93d89a7 100644
--- a/telephony/java/android/telephony/SmsMessage.java
+++ b/telephony/java/android/telephony/SmsMessage.java
@@ -124,7 +124,7 @@
      */
     public static SmsMessage createFromPdu(byte[] pdu) {
         SmsMessageBase wrappedMessage;
-        int activePhone = TelephonyManager.getDefault().getPhoneType();
+        int activePhone = TelephonyManager.getDefault().getCurrentPhoneType();
 
         if (PHONE_TYPE_CDMA == activePhone) {
             wrappedMessage = com.android.internal.telephony.cdma.SmsMessage.createFromPdu(pdu);
@@ -146,7 +146,7 @@
      */
     public static SmsMessage newFromCMT(String[] lines){
         SmsMessageBase wrappedMessage;
-        int activePhone = TelephonyManager.getDefault().getPhoneType();
+        int activePhone = TelephonyManager.getDefault().getCurrentPhoneType();
 
         if (PHONE_TYPE_CDMA == activePhone) {
             wrappedMessage = com.android.internal.telephony.cdma.SmsMessage.newFromCMT(lines);
@@ -160,7 +160,7 @@
     /** @hide */
     protected static SmsMessage newFromCMTI(String line) {
         SmsMessageBase wrappedMessage;
-        int activePhone = TelephonyManager.getDefault().getPhoneType();
+        int activePhone = TelephonyManager.getDefault().getCurrentPhoneType();
 
         if (PHONE_TYPE_CDMA == activePhone) {
             wrappedMessage = com.android.internal.telephony.cdma.SmsMessage.newFromCMTI(line);
@@ -174,7 +174,7 @@
     /** @hide */
     public static SmsMessage newFromCDS(String line) {
         SmsMessageBase wrappedMessage;
-        int activePhone = TelephonyManager.getDefault().getPhoneType();
+        int activePhone = TelephonyManager.getDefault().getCurrentPhoneType();
 
         if (PHONE_TYPE_CDMA == activePhone) {
             wrappedMessage = com.android.internal.telephony.cdma.SmsMessage.newFromCDS(line);
@@ -188,7 +188,7 @@
     /** @hide */
     public static SmsMessage newFromParcel(Parcel p) {
         SmsMessageBase wrappedMessage;
-        int activePhone = TelephonyManager.getDefault().getPhoneType();
+        int activePhone = TelephonyManager.getDefault().getCurrentPhoneType();
 
         if (PHONE_TYPE_CDMA == activePhone) {
             wrappedMessage = com.android.internal.telephony.cdma.SmsMessage.newFromParcel(p);
@@ -211,7 +211,7 @@
      */
     public static SmsMessage createFromEfRecord(int index, byte[] data) {
         SmsMessageBase wrappedMessage;
-        int activePhone = TelephonyManager.getDefault().getPhoneType();
+        int activePhone = TelephonyManager.getDefault().getCurrentPhoneType();
 
         if (PHONE_TYPE_CDMA == activePhone) {
             wrappedMessage = com.android.internal.telephony.cdma.SmsMessage.createFromEfRecord(
@@ -229,7 +229,7 @@
      * length in bytes (not hex chars) less the SMSC header
      */
     public static int getTPLayerLengthForPDU(String pdu) {
-        int activePhone = TelephonyManager.getDefault().getPhoneType();
+        int activePhone = TelephonyManager.getDefault().getCurrentPhoneType();
 
         if (PHONE_TYPE_CDMA == activePhone) {
             return com.android.internal.telephony.cdma.SmsMessage.getTPLayerLengthForPDU(pdu);
@@ -265,7 +265,7 @@
      *         class).
      */
     public static int[] calculateLength(CharSequence msgBody, boolean use7bitOnly) {
-        int activePhone = TelephonyManager.getDefault().getPhoneType();
+        int activePhone = TelephonyManager.getDefault().getCurrentPhoneType();
         TextEncodingDetails ted = (PHONE_TYPE_CDMA == activePhone) ?
             com.android.internal.telephony.cdma.SmsMessage.calculateLength(msgBody, use7bitOnly) :
             com.android.internal.telephony.gsm.SmsMessage.calculateLength(msgBody, use7bitOnly);
@@ -288,7 +288,7 @@
      * @hide
      */
     public static ArrayList<String> fragmentText(String text) {
-        int activePhone = TelephonyManager.getDefault().getPhoneType();
+        int activePhone = TelephonyManager.getDefault().getCurrentPhoneType();
         TextEncodingDetails ted = (PHONE_TYPE_CDMA == activePhone) ?
             com.android.internal.telephony.cdma.SmsMessage.calculateLength(text, false) :
             com.android.internal.telephony.gsm.SmsMessage.calculateLength(text, false);
@@ -385,7 +385,7 @@
             String destinationAddress, String message,
             boolean statusReportRequested, byte[] header) {
         SubmitPduBase spb;
-        int activePhone = TelephonyManager.getDefault().getPhoneType();
+        int activePhone = TelephonyManager.getDefault().getCurrentPhoneType();
 
         if (PHONE_TYPE_CDMA == activePhone) {
             spb = com.android.internal.telephony.cdma.SmsMessage.getSubmitPdu(scAddress,
@@ -410,7 +410,7 @@
     public static SubmitPdu getSubmitPdu(String scAddress,
             String destinationAddress, String message, boolean statusReportRequested) {
         SubmitPduBase spb;
-        int activePhone = TelephonyManager.getDefault().getPhoneType();
+        int activePhone = TelephonyManager.getDefault().getCurrentPhoneType();
 
         if (PHONE_TYPE_CDMA == activePhone) {
             spb = com.android.internal.telephony.cdma.SmsMessage.getSubmitPdu(scAddress,
@@ -439,7 +439,7 @@
             String destinationAddress, short destinationPort, byte[] data,
             boolean statusReportRequested) {
         SubmitPduBase spb;
-        int activePhone = TelephonyManager.getDefault().getPhoneType();
+        int activePhone = TelephonyManager.getDefault().getCurrentPhoneType();
 
         if (PHONE_TYPE_CDMA == activePhone) {
             spb = com.android.internal.telephony.cdma.SmsMessage.getSubmitPdu(scAddress,
@@ -708,7 +708,7 @@
      * @hide
      */
     private static final SmsMessageBase getSmsFacility(){
-        int activePhone = TelephonyManager.getDefault().getPhoneType();
+        int activePhone = TelephonyManager.getDefault().getCurrentPhoneType();
         if (PHONE_TYPE_CDMA == activePhone) {
             return new com.android.internal.telephony.cdma.SmsMessage();
         } else {
