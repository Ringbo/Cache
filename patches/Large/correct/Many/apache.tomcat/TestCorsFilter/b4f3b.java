diff --git a/test/org/apache/catalina/filters/TestCorsFilter.java b/test/org/apache/catalina/filters/TestCorsFilter.java
index 0049876..83aa719 100644
--- a/test/org/apache/catalina/filters/TestCorsFilter.java
+++ b/test/org/apache/catalina/filters/TestCorsFilter.java
@@ -31,7 +31,7 @@
 public class TestCorsFilter {
     private FilterChain filterChain = new TesterFilterChain();
 
-    /**
+    /*
      * Tests if a GET request is treated as simple request.
      *
      * @See http://www.w3.org/TR/cors/#simple-method
@@ -63,7 +63,7 @@
                 CorsFilter.CORSRequestType.SIMPLE.name().toLowerCase()));
     }
 
-    /**
+    /*
      * Tests if a POST request is treated as simple request.
      *
      * @See http://www.w3.org/TR/cors/#simple-method
@@ -96,7 +96,7 @@
                 CorsFilter.CORSRequestType.SIMPLE.name().toLowerCase()));
     }
 
-    /**
+    /*
      * Tests if a HEAD request is treated as simple request.
      *
      * @See http://www.w3.org/TR/cors/#simple-method
@@ -128,7 +128,7 @@
                 CorsFilter.CORSRequestType.SIMPLE.name().toLowerCase()));
     }
 
-    /**
+    /*
      * Test the presence of specific origin in response, when '*' is not used.
      *
      * @throws IOException
@@ -161,7 +161,7 @@
                 CorsFilter.CORSRequestType.SIMPLE.name().toLowerCase()));
     }
 
-    /**
+    /*
      * Tests the prsence of the origin (and not '*') in the response, when
      * supports credentials is enabled alongwith any origin, '*'.
      *
@@ -199,7 +199,7 @@
                 CorsFilter.CORSRequestType.SIMPLE.name().toLowerCase()));
     }
 
-    /**
+    /*
      * Tests the presence of the origin (and not '*') in the response, when
      * supports credentials is enabled alongwith any origin, '*'.
      *
@@ -235,7 +235,7 @@
                 CorsFilter.CORSRequestType.SIMPLE.name().toLowerCase()));
     }
 
-    /**
+    /*
      * Tests the presence of exposed headers in response, if configured.
      *
      * @throws IOException
@@ -272,7 +272,7 @@
                 CorsFilter.CORSRequestType.SIMPLE.name().toLowerCase()));
     }
 
-    /**
+    /*
      * Checks if an OPTIONS request is processed as pre-flight.
      *
      * @throws IOException
@@ -312,7 +312,7 @@
                 "Content-Type"));
     }
 
-    /**
+    /*
      * Checks if an OPTIONS request is processed as pre-flight where any origin
      * is enabled.
      *
@@ -354,7 +354,7 @@
                 "Content-Type"));
     }
 
-    /**
+    /*
      * Checks if an OPTIONS request is processed as pre-flight.
      *
      * @throws IOException
@@ -496,7 +496,7 @@
                 "Content-Type"));
     }
 
-    /**
+    /*
      * Negative test, when a CORS request arrives, with a null origin.
      */
     @Test
@@ -596,7 +596,7 @@
         // worked as expected.
     }
 
-    /**
+    /*
      * Tests if a non-simple request is given to simple request handler.
      *
      * @throws IOException
@@ -621,7 +621,7 @@
         corsFilter.handleSimpleCORS(request, response, filterChain);
     }
 
-    /**
+    /*
      * When a non-preflight request is given to a pre-flight request handler.
      *
      * @throws IOException
@@ -690,7 +690,7 @@
         Assert.assertEquals(CorsFilter.CORSRequestType.SIMPLE, requestType);
     }
 
-    /**
+    /*
      * Happy path test, when a valid CORS Simple request arrives.
      *
      * @throws ServletException
@@ -709,7 +709,7 @@
         Assert.assertEquals(CorsFilter.CORSRequestType.SIMPLE, requestType);
     }
 
-    /**
+    /*
      * Happy path test, when a valid CORS Simple request arrives.
      *
      * @throws ServletException
@@ -728,7 +728,7 @@
         Assert.assertEquals(CorsFilter.CORSRequestType.ACTUAL, requestType);
     }
 
-    /**
+    /*
      * Happy path test, when a valid CORS Simple request arrives.
      *
      * @throws ServletException
@@ -749,7 +749,7 @@
         Assert.assertEquals(CorsFilter.CORSRequestType.ACTUAL, requestType);
     }
 
-    /**
+    /*
      * Happy path test, when a valid CORS Pre-flight request arrives.
      *
      * @throws ServletException
@@ -774,16 +774,12 @@
         Assert.assertEquals(CorsFilter.CORSRequestType.PRE_FLIGHT, requestType);
     }
 
-    /**
+    /*
      * when a valid CORS Pre-flight request arrives, with no
      * Access-Control-Request-Method
-     *
-     * @throws ServletException
-     * @throws IOException
      */
     @Test
-    public void testCheckPreFlightRequestTypeNoACRM() throws ServletException,
-            IOException {
+    public void testCheckPreFlightRequestTypeNoACRM() throws ServletException {
         TesterHttpServletRequest request = new TesterHttpServletRequest();
         request.setHeader(CorsFilter.REQUEST_HEADER_ORIGIN,
                 TesterFilterConfigs.HTTP_TOMCAT_APACHE_ORG);
@@ -797,16 +793,13 @@
         Assert.assertEquals(CorsFilter.CORSRequestType.ACTUAL, requestType);
     }
 
-    /**
+    /*
      * when a valid CORS Pre-flight request arrives, with empty
      * Access-Control-Request-Method
-     *
-     * @throws ServletException
-     * @throws IOException
      */
     @Test
     public void testCheckPreFlightRequestTypeEmptyACRM()
-            throws ServletException, IOException {
+            throws ServletException {
         TesterHttpServletRequest request = new TesterHttpServletRequest();
         request.setHeader(CorsFilter.REQUEST_HEADER_ORIGIN,
                 TesterFilterConfigs.HTTP_TOMCAT_APACHE_ORG);
@@ -823,7 +816,7 @@
                 requestType);
     }
 
-    /**
+    /*
      * Happy path test, when a valid CORS Pre-flight request arrives.
      *
      * @throws ServletException
@@ -846,7 +839,7 @@
         Assert.assertEquals(CorsFilter.CORSRequestType.PRE_FLIGHT, requestType);
     }
 
-    /**
+    /*
      * Section 6.2.3
      *
      * @throws ServletException
@@ -871,7 +864,7 @@
                 response.getStatus());
     }
 
-    /**
+    /*
      * Section Section 6.2.5
      *
      * @throws ServletException
@@ -896,7 +889,7 @@
                 response.getStatus());
     }
 
-    /**
+    /*
      * Section Section 6.2.6
      *
      * @throws ServletException
@@ -924,7 +917,7 @@
                 response.getStatus());
     }
 
-    /**
+    /*
      * Section Section 6.2.7
      *
      * @throws ServletException
@@ -974,7 +967,7 @@
                 response.getStatus());
     }
 
-    /**
+    /*
      * Happy path test, when a valid CORS Pre-flight request arrives.
      *
      * @throws ServletException
@@ -1000,7 +993,7 @@
         Assert.assertEquals(CorsFilter.CORSRequestType.PRE_FLIGHT, requestType);
     }
 
-    /**
+    /*
      * Negative test, when a CORS request arrives, with an empty origin.
      *
      * @throws ServletException
@@ -1021,7 +1014,7 @@
                 requestType);
     }
 
-    /**
+    /*
      * Tests for failure, when a different domain is used, that's not in the
      * allowed list of origins.
      *
@@ -1043,7 +1036,7 @@
                 response.getStatus());
     }
 
-    /**
+    /*
      * Tests for failure, when a different sub-domain is used, that's not in the
      * allowed list of origins.
      *
@@ -1066,7 +1059,7 @@
                 response.getStatus());
     }
 
-    /**
+    /*
      * PUT is not an allowed request method.
      *
      * @throws ServletException
@@ -1088,7 +1081,7 @@
                 response.getStatus());
     }
 
-    /**
+    /*
      * When requestMethod is null
      *
      * @throws ServletException
@@ -1108,7 +1101,7 @@
                 requestType);
     }
 
-    /**
+    /*
      * "http://tomcat.apache.org" is an allowed origin and
      * "https://tomcat.apache.org" is not, because scheme doesn't match
      *
@@ -1129,7 +1122,7 @@
                 requestType);
     }
 
-    /**
+    /*
      * "http://tomcat.apache.org" is an allowed origin and
      * "http://tomcat.apache.org:8080" is not, because ports doesn't match
      *
@@ -1151,14 +1144,12 @@
                 response.getStatus());
     }
 
-    /**
+    /*
      * Tests for failure, when an invalid {@link HttpServletRequest} is
      * encountered.
-     *
-     * @throws ServletException
      */
     @Test(expected = IllegalArgumentException.class)
-    public void testCheckRequestTypeNull() throws ServletException {
+    public void testCheckRequestTypeNull() {
         HttpServletRequest request = null;
         CorsFilter corsFilter = new CorsFilter();
         corsFilter.checkRequestType(request);
@@ -1275,7 +1266,7 @@
         Assert.assertTrue(corsFilter.getPreflightMaxAge() == 0);
     }
 
-    /**
+    /*
      * If an init param is null, it's default value will be used.
      *
      * @throws ServletException
