/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.endpoint.dsl;

import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.stream.*;
import javax.annotation.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * Transform XML payloads using an XSLT template using Saxon.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface XsltSaxonEndpointBuilderFactory {


    /**
     * Builder for endpoint for the XSLT Saxon component.
     */
    public interface XsltSaxonEndpointBuilder extends EndpointProducerBuilder {
        default AdvancedXsltSaxonEndpointBuilder advanced() {
            return (AdvancedXsltSaxonEndpointBuilder) this;
        }
        /**
         * Whether to allow using StAX as the javax.xml.transform.Source. You
         * can enable this if the XSLT library supports StAX such as the Saxon
         * library (camel-saxon). The Xalan library (default in JVM) does not
         * support StAXSource.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: producer
         * 
         * @param allowStAX the value to set
         * @return the dsl builder
         */
        default XsltSaxonEndpointBuilder allowStAX(boolean allowStAX) {
            doSetProperty("allowStAX", allowStAX);
            return this;
        }
        /**
         * Whether to allow using StAX as the javax.xml.transform.Source. You
         * can enable this if the XSLT library supports StAX such as the Saxon
         * library (camel-saxon). The Xalan library (default in JVM) does not
         * support StAXSource.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: true
         * Group: producer
         * 
         * @param allowStAX the value to set
         * @return the dsl builder
         */
        default XsltSaxonEndpointBuilder allowStAX(String allowStAX) {
            doSetProperty("allowStAX", allowStAX);
            return this;
        }
        /**
         * Cache for the resource content (the stylesheet file) when it is
         * loaded. If set to false Camel will reload the stylesheet file on each
         * message processing. This is good for development. A cached stylesheet
         * can be forced to reload at runtime via JMX using the
         * clearCachedStylesheet operation.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: producer
         * 
         * @param contentCache the value to set
         * @return the dsl builder
         */
        default XsltSaxonEndpointBuilder contentCache(boolean contentCache) {
            doSetProperty("contentCache", contentCache);
            return this;
        }
        /**
         * Cache for the resource content (the stylesheet file) when it is
         * loaded. If set to false Camel will reload the stylesheet file on each
         * message processing. This is good for development. A cached stylesheet
         * can be forced to reload at runtime via JMX using the
         * clearCachedStylesheet operation.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: true
         * Group: producer
         * 
         * @param contentCache the value to set
         * @return the dsl builder
         */
        default XsltSaxonEndpointBuilder contentCache(String contentCache) {
            doSetProperty("contentCache", contentCache);
            return this;
        }
        /**
         * If you have output=file then this option dictates whether or not the
         * output file should be deleted when the Exchange is done processing.
         * For example suppose the output file is a temporary file, then it can
         * be a good idea to delete it after use.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param deleteOutputFile the value to set
         * @return the dsl builder
         */
        default XsltSaxonEndpointBuilder deleteOutputFile(
                boolean deleteOutputFile) {
            doSetProperty("deleteOutputFile", deleteOutputFile);
            return this;
        }
        /**
         * If you have output=file then this option dictates whether or not the
         * output file should be deleted when the Exchange is done processing.
         * For example suppose the output file is a temporary file, then it can
         * be a good idea to delete it after use.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param deleteOutputFile the value to set
         * @return the dsl builder
         */
        default XsltSaxonEndpointBuilder deleteOutputFile(
                String deleteOutputFile) {
            doSetProperty("deleteOutputFile", deleteOutputFile);
            return this;
        }
        /**
         * Whether or not to throw an exception if the input body is null.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: producer
         * 
         * @param failOnNullBody the value to set
         * @return the dsl builder
         */
        default XsltSaxonEndpointBuilder failOnNullBody(boolean failOnNullBody) {
            doSetProperty("failOnNullBody", failOnNullBody);
            return this;
        }
        /**
         * Whether or not to throw an exception if the input body is null.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: true
         * Group: producer
         * 
         * @param failOnNullBody the value to set
         * @return the dsl builder
         */
        default XsltSaxonEndpointBuilder failOnNullBody(String failOnNullBody) {
            doSetProperty("failOnNullBody", failOnNullBody);
            return this;
        }
        /**
         * Option to specify which output type to use. Possible values are:
         * string, bytes, DOM, file. The first three options are all in memory
         * based, where as file is streamed directly to a java.io.File. For file
         * you must specify the filename in the IN header with the key
         * XsltConstants.XSLT_FILE_NAME which is also CamelXsltFileName. Also
         * any paths leading to the filename must be created beforehand,
         * otherwise an exception is thrown at runtime.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.xslt.XsltOutput&lt;/code&gt;
         * type.
         * 
         * Default: string
         * Group: producer
         * 
         * @param output the value to set
         * @return the dsl builder
         */
        default XsltSaxonEndpointBuilder output(
                org.apache.camel.component.xslt.XsltOutput output) {
            doSetProperty("output", output);
            return this;
        }
        /**
         * Option to specify which output type to use. Possible values are:
         * string, bytes, DOM, file. The first three options are all in memory
         * based, where as file is streamed directly to a java.io.File. For file
         * you must specify the filename in the IN header with the key
         * XsltConstants.XSLT_FILE_NAME which is also CamelXsltFileName. Also
         * any paths leading to the filename must be created beforehand,
         * otherwise an exception is thrown at runtime.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.xslt.XsltOutput&lt;/code&gt;
         * type.
         * 
         * Default: string
         * Group: producer
         * 
         * @param output the value to set
         * @return the dsl builder
         */
        default XsltSaxonEndpointBuilder output(String output) {
            doSetProperty("output", output);
            return this;
        }
        /**
         * The number of javax.xml.transform.Transformer object that are cached
         * for reuse to avoid calls to Template.newTransformer().
         * 
         * The option is a: &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Default: 0
         * Group: producer
         * 
         * @param transformerCacheSize the value to set
         * @return the dsl builder
         */
        default XsltSaxonEndpointBuilder transformerCacheSize(
                int transformerCacheSize) {
            doSetProperty("transformerCacheSize", transformerCacheSize);
            return this;
        }
        /**
         * The number of javax.xml.transform.Transformer object that are cached
         * for reuse to avoid calls to Template.newTransformer().
         * 
         * The option will be converted to a &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Default: 0
         * Group: producer
         * 
         * @param transformerCacheSize the value to set
         * @return the dsl builder
         */
        default XsltSaxonEndpointBuilder transformerCacheSize(
                String transformerCacheSize) {
            doSetProperty("transformerCacheSize", transformerCacheSize);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the XSLT Saxon component.
     */
    public interface AdvancedXsltSaxonEndpointBuilder
            extends
                EndpointProducerBuilder {
        default XsltSaxonEndpointBuilder basic() {
            return (XsltSaxonEndpointBuilder) this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer (advanced)
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default AdvancedXsltSaxonEndpointBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer (advanced)
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default AdvancedXsltSaxonEndpointBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * To use a custom org.xml.sax.EntityResolver with
         * javax.xml.transform.sax.SAXSource.
         * 
         * The option is a: &lt;code&gt;org.xml.sax.EntityResolver&lt;/code&gt;
         * type.
         * 
         * Group: advanced
         * 
         * @param entityResolver the value to set
         * @return the dsl builder
         */
        default AdvancedXsltSaxonEndpointBuilder entityResolver(
                org.xml.sax.EntityResolver entityResolver) {
            doSetProperty("entityResolver", entityResolver);
            return this;
        }
        /**
         * To use a custom org.xml.sax.EntityResolver with
         * javax.xml.transform.sax.SAXSource.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.xml.sax.EntityResolver&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param entityResolver the value to set
         * @return the dsl builder
         */
        default AdvancedXsltSaxonEndpointBuilder entityResolver(
                String entityResolver) {
            doSetProperty("entityResolver", entityResolver);
            return this;
        }
        /**
         * Allows to configure to use a custom
         * javax.xml.transform.ErrorListener. Beware when doing this then the
         * default error listener which captures any errors or fatal errors and
         * store information on the Exchange as properties is not in use. So
         * only use this option for special use-cases.
         * 
         * The option is a:
         * &lt;code&gt;javax.xml.transform.ErrorListener&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param errorListener the value to set
         * @return the dsl builder
         */
        default AdvancedXsltSaxonEndpointBuilder errorListener(
                javax.xml.transform.ErrorListener errorListener) {
            doSetProperty("errorListener", errorListener);
            return this;
        }
        /**
         * Allows to configure to use a custom
         * javax.xml.transform.ErrorListener. Beware when doing this then the
         * default error listener which captures any errors or fatal errors and
         * store information on the Exchange as properties is not in use. So
         * only use this option for special use-cases.
         * 
         * The option will be converted to a
         * &lt;code&gt;javax.xml.transform.ErrorListener&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param errorListener the value to set
         * @return the dsl builder
         */
        default AdvancedXsltSaxonEndpointBuilder errorListener(
                String errorListener) {
            doSetProperty("errorListener", errorListener);
            return this;
        }
        /**
         * Allows you to use a custom
         * org.apache.camel.builder.xml.ResultHandlerFactory which is capable of
         * using custom org.apache.camel.builder.xml.ResultHandler types.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.xslt.ResultHandlerFactory&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param resultHandlerFactory the value to set
         * @return the dsl builder
         */
        default AdvancedXsltSaxonEndpointBuilder resultHandlerFactory(
                org.apache.camel.component.xslt.ResultHandlerFactory resultHandlerFactory) {
            doSetProperty("resultHandlerFactory", resultHandlerFactory);
            return this;
        }
        /**
         * Allows you to use a custom
         * org.apache.camel.builder.xml.ResultHandlerFactory which is capable of
         * using custom org.apache.camel.builder.xml.ResultHandler types.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.xslt.ResultHandlerFactory&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param resultHandlerFactory the value to set
         * @return the dsl builder
         */
        default AdvancedXsltSaxonEndpointBuilder resultHandlerFactory(
                String resultHandlerFactory) {
            doSetProperty("resultHandlerFactory", resultHandlerFactory);
            return this;
        }
        /**
         * To use a custom Saxon configuration.
         * 
         * The option is a: &lt;code&gt;net.sf.saxon.Configuration&lt;/code&gt;
         * type.
         * 
         * Group: advanced
         * 
         * @param saxonConfiguration the value to set
         * @return the dsl builder
         */
        default AdvancedXsltSaxonEndpointBuilder saxonConfiguration(
                net.sf.saxon.Configuration saxonConfiguration) {
            doSetProperty("saxonConfiguration", saxonConfiguration);
            return this;
        }
        /**
         * To use a custom Saxon configuration.
         * 
         * The option will be converted to a
         * &lt;code&gt;net.sf.saxon.Configuration&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param saxonConfiguration the value to set
         * @return the dsl builder
         */
        default AdvancedXsltSaxonEndpointBuilder saxonConfiguration(
                String saxonConfiguration) {
            doSetProperty("saxonConfiguration", saxonConfiguration);
            return this;
        }
        /**
         * Allows you to use a custom
         * net.sf.saxon.lib.ExtensionFunctionDefinition. You would need to add
         * camel-saxon to the classpath. The function is looked up in the
         * registry, where you can comma to separate multiple values to lookup.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param saxonExtensionFunctions the value to set
         * @return the dsl builder
         */
        default AdvancedXsltSaxonEndpointBuilder saxonExtensionFunctions(
                String saxonExtensionFunctions) {
            doSetProperty("saxonExtensionFunctions", saxonExtensionFunctions);
            return this;
        }
        /**
         * To use a custom XSLT transformer factory.
         * 
         * The option is a:
         * &lt;code&gt;javax.xml.transform.TransformerFactory&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param transformerFactory the value to set
         * @return the dsl builder
         */
        default AdvancedXsltSaxonEndpointBuilder transformerFactory(
                javax.xml.transform.TransformerFactory transformerFactory) {
            doSetProperty("transformerFactory", transformerFactory);
            return this;
        }
        /**
         * To use a custom XSLT transformer factory.
         * 
         * The option will be converted to a
         * &lt;code&gt;javax.xml.transform.TransformerFactory&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param transformerFactory the value to set
         * @return the dsl builder
         */
        default AdvancedXsltSaxonEndpointBuilder transformerFactory(
                String transformerFactory) {
            doSetProperty("transformerFactory", transformerFactory);
            return this;
        }
        /**
         * To use a custom XSLT transformer factory, specified as a FQN class
         * name.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param transformerFactoryClass the value to set
         * @return the dsl builder
         */
        default AdvancedXsltSaxonEndpointBuilder transformerFactoryClass(
                String transformerFactoryClass) {
            doSetProperty("transformerFactoryClass", transformerFactoryClass);
            return this;
        }
        /**
         * A configuration strategy to apply on freshly created instances of
         * TransformerFactory.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.xslt.TransformerFactoryConfigurationStrategy&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param transformerFactoryConfigurationStrategy the value to set
         * @return the dsl builder
         */
        default AdvancedXsltSaxonEndpointBuilder transformerFactoryConfigurationStrategy(
                org.apache.camel.component.xslt.TransformerFactoryConfigurationStrategy transformerFactoryConfigurationStrategy) {
            doSetProperty("transformerFactoryConfigurationStrategy", transformerFactoryConfigurationStrategy);
            return this;
        }
        /**
         * A configuration strategy to apply on freshly created instances of
         * TransformerFactory.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.xslt.TransformerFactoryConfigurationStrategy&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param transformerFactoryConfigurationStrategy the value to set
         * @return the dsl builder
         */
        default AdvancedXsltSaxonEndpointBuilder transformerFactoryConfigurationStrategy(
                String transformerFactoryConfigurationStrategy) {
            doSetProperty("transformerFactoryConfigurationStrategy", transformerFactoryConfigurationStrategy);
            return this;
        }
        /**
         * To use a custom javax.xml.transform.URIResolver.
         * 
         * The option is a:
         * &lt;code&gt;javax.xml.transform.URIResolver&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param uriResolver the value to set
         * @return the dsl builder
         */
        default AdvancedXsltSaxonEndpointBuilder uriResolver(
                javax.xml.transform.URIResolver uriResolver) {
            doSetProperty("uriResolver", uriResolver);
            return this;
        }
        /**
         * To use a custom javax.xml.transform.URIResolver.
         * 
         * The option will be converted to a
         * &lt;code&gt;javax.xml.transform.URIResolver&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param uriResolver the value to set
         * @return the dsl builder
         */
        default AdvancedXsltSaxonEndpointBuilder uriResolver(String uriResolver) {
            doSetProperty("uriResolver", uriResolver);
            return this;
        }
    }

    public interface XsltSaxonBuilders {
        /**
         * XSLT Saxon (camel-xslt-saxon)
         * Transform XML payloads using an XSLT template using Saxon.
         * 
         * Category: core,transformation
         * Since: 3.0
         * Maven coordinates: org.apache.camel:camel-xslt-saxon
         * 
         * Syntax: <code>xslt-saxon:resourceUri</code>
         * 
         * Path parameter: resourceUri (required)
         * Path to the template. The following is supported by the default
         * URIResolver. You can prefix with: classpath, file, http, ref, or
         * bean. classpath, file and http loads the resource using these
         * protocols (classpath is default). ref will lookup the resource in the
         * registry. bean will call a method on a bean to be used as the
         * resource. For bean you can specify the method name after dot, eg
         * bean:myBean.myMethod
         * 
         * @param path resourceUri
         * @return the dsl builder
         */
        default XsltSaxonEndpointBuilder xsltSaxon(String path) {
            return XsltSaxonEndpointBuilderFactory.endpointBuilder("xslt-saxon", path);
        }
        /**
         * XSLT Saxon (camel-xslt-saxon)
         * Transform XML payloads using an XSLT template using Saxon.
         * 
         * Category: core,transformation
         * Since: 3.0
         * Maven coordinates: org.apache.camel:camel-xslt-saxon
         * 
         * Syntax: <code>xslt-saxon:resourceUri</code>
         * 
         * Path parameter: resourceUri (required)
         * Path to the template. The following is supported by the default
         * URIResolver. You can prefix with: classpath, file, http, ref, or
         * bean. classpath, file and http loads the resource using these
         * protocols (classpath is default). ref will lookup the resource in the
         * registry. bean will call a method on a bean to be used as the
         * resource. For bean you can specify the method name after dot, eg
         * bean:myBean.myMethod
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path resourceUri
         * @return the dsl builder
         */
        default XsltSaxonEndpointBuilder xsltSaxon(
                String componentName,
                String path) {
            return XsltSaxonEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }
    static XsltSaxonEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class XsltSaxonEndpointBuilderImpl extends AbstractEndpointBuilder implements XsltSaxonEndpointBuilder, AdvancedXsltSaxonEndpointBuilder {
            public XsltSaxonEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new XsltSaxonEndpointBuilderImpl(path);
    }
}