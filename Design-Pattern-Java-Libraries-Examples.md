<p>You can find an overview of a lot of design patterns in <a href="https://en.wikipedia.org/wiki/Software_design_pattern#Classification_and_list" rel="nofollow noreferrer">Wikipedia</a>. It also mentions which patterns are mentioned by GoF. I'll sum them up here and try to assign as many pattern implementations as possible, found in both the Java SE and Java EE APIs.</p>

<hr>

<h2><a href="http://en.wikipedia.org/wiki/Creational_pattern" rel="nofollow noreferrer">Creational patterns</a></h2>

<h3><a href="http://en.wikipedia.org/wiki/Abstract_factory_pattern" rel="nofollow noreferrer">Abstract factory</a> <sup><sub>(recognizeable by creational methods returning the factory itself which in turn can be used to create another abstract/interface type)</sub></sup></h3>

<ul>
<li><a href="http://docs.oracle.com/javase/8/docs/api/javax/xml/parsers/DocumentBuilderFactory.html#newInstance--" rel="nofollow noreferrer"><code>javax.xml.parsers.DocumentBuilderFactory#newInstance()</code></a></li>
<li><a href="http://docs.oracle.com/javase/8/docs/api/javax/xml/transform/TransformerFactory.html#newInstance--" rel="nofollow noreferrer"><code>javax.xml.transform.TransformerFactory#newInstance()</code></a></li>
<li><a href="http://docs.oracle.com/javase/8/docs/api/javax/xml/xpath/XPathFactory.html#newInstance--" rel="nofollow noreferrer"><code>javax.xml.xpath.XPathFactory#newInstance()</code></a></li>
</ul>

<h3><a href="http://en.wikipedia.org/wiki/Builder_pattern" rel="nofollow noreferrer">Builder</a> <sup><sub>(recognizeable by creational methods returning the instance itself)</sub></sup></h3>

<ul>
<li><a href="http://docs.oracle.com/javase/8/docs/api/java/lang/StringBuilder.html#append-boolean-" rel="nofollow noreferrer"><code>java.lang.StringBuilder#append()</code></a> (unsynchronized)</li>
<li><a href="http://docs.oracle.com/javase/8/docs/api/java/lang/StringBuffer.html#append-boolean-" rel="nofollow noreferrer"><code>java.lang.StringBuffer#append()</code></a> (synchronized)</li>
<li><a href="http://docs.oracle.com/javase/8/docs/api/java/nio/ByteBuffer.html#put-byte-" rel="nofollow noreferrer"><code>java.nio.ByteBuffer#put()</code></a> (also on <a href="http://docs.oracle.com/javase/8/docs/api/java/nio/CharBuffer.html#put-char-" rel="nofollow noreferrer"><code>CharBuffer</code></a>, <a href="http://docs.oracle.com/javase/8/docs/api/java/nio/ShortBuffer.html#put-short-" rel="nofollow noreferrer"><code>ShortBuffer</code></a>, <a href="http://docs.oracle.com/javase/8/docs/api/java/nio/IntBuffer.html#put-int-" rel="nofollow noreferrer"><code>IntBuffer</code></a>, <a href="http://docs.oracle.com/javase/8/docs/api/java/nio/LongBuffer.html#put-long-" rel="nofollow noreferrer"><code>LongBuffer</code></a>, <a href="http://docs.oracle.com/javase/8/docs/api/java/nio/FloatBuffer.html#put-float-" rel="nofollow noreferrer"><code>FloatBuffer</code></a> and <a href="http://docs.oracle.com/javase/8/docs/api/java/nio/DoubleBuffer.html#put-double-" rel="nofollow noreferrer"><code>DoubleBuffer</code></a>)</li>
<li><a href="http://docs.oracle.com/javase/8/docs/api/javax/swing/GroupLayout.Group.html#addComponent-java.awt.Component-" rel="nofollow noreferrer"><code>javax.swing.GroupLayout.Group#addComponent()</code></a></li>
<li>All implementations of <a href="http://docs.oracle.com/javase/8/docs/api/java/lang/Appendable.html" rel="nofollow noreferrer"><code>java.lang.Appendable</code></a></li>
<li><a href="https://docs.oracle.com/javase/9/docs/api/java/util/stream/Stream.Builder.html" rel="nofollow noreferrer"><code>java.util.stream.Stream.Builder</code></a></li>
</ul>

<h3><a href="http://en.wikipedia.org/wiki/Factory_method_pattern" rel="nofollow noreferrer">Factory method</a> <sup><sub>(recognizeable by creational methods returning an implementation of an abstract/interface type)</sub></sup></h3>

<ul>
<li><a href="http://docs.oracle.com/javase/8/docs/api/java/util/Calendar.html#getInstance--" rel="nofollow noreferrer"><code>java.util.Calendar#getInstance()</code></a></li>
<li><a href="http://docs.oracle.com/javase/8/docs/api/java/util/ResourceBundle.html#getBundle-java.lang.String-" rel="nofollow noreferrer"><code>java.util.ResourceBundle#getBundle()</code></a></li>
<li><a href="http://docs.oracle.com/javase/8/docs/api/java/text/NumberFormat.html#getInstance--" rel="nofollow noreferrer"><code>java.text.NumberFormat#getInstance()</code></a></li>
<li><a href="http://docs.oracle.com/javase/8/docs/api/java/nio/charset/Charset.html#forName-java.lang.String-" rel="nofollow noreferrer"><code>java.nio.charset.Charset#forName()</code></a></li>
<li><a href="http://docs.oracle.com/javase/8/docs/api/java/net/URLStreamHandlerFactory.html" rel="nofollow noreferrer"><code>java.net.URLStreamHandlerFactory#createURLStreamHandler(String)</code></a> (Returns singleton object per protocol)</li>
<li><a href="https://docs.oracle.com/javase/8/docs/api/java/util/EnumSet.html#of(E)" rel="nofollow noreferrer"><code>java.util.EnumSet#of()</code></a></li>
<li><a href="https://docs.oracle.com/javase/8/docs/api/javax/xml/bind/JAXBContext.html#createMarshaller--" rel="nofollow noreferrer"><code>javax.xml.bind.JAXBContext#createMarshaller()</code></a> and other similar methods</li>
</ul>

<h3><a href="http://en.wikipedia.org/wiki/Prototype_pattern" rel="nofollow noreferrer">Prototype</a> <sup><sub>(recognizeable by creational methods returning a <em>different</em> instance of itself with the same properties)</sub></sup></h3>

<ul>
<li><a href="http://docs.oracle.com/javase/8/docs/api/java/lang/Object.html#clone--" rel="nofollow noreferrer"><code>java.lang.Object#clone()</code></a> (the class has to implement <a href="http://docs.oracle.com/javase/8/docs/api/java/lang/Cloneable.html" rel="nofollow noreferrer"><code>java.lang.Cloneable</code></a>)</li>
</ul>

<h3><a href="http://en.wikipedia.org/wiki/Singleton_pattern" rel="nofollow noreferrer">Singleton</a> <sup><sub>(recognizeable by creational methods returning the <em>same</em> instance (usually of itself) everytime)</sub></sup></h3>

<ul>
<li><a href="http://docs.oracle.com/javase/8/docs/api/java/lang/Runtime.html#getRuntime--" rel="nofollow noreferrer"><code>java.lang.Runtime#getRuntime()</code></a></li>
<li><a href="http://docs.oracle.com/javase/8/docs/api/java/awt/Desktop.html#getDesktop--" rel="nofollow noreferrer"><code>java.awt.Desktop#getDesktop()</code></a></li>
<li><a href="http://docs.oracle.com/javase/8/docs/api/java/lang/System.html#getSecurityManager--" rel="nofollow noreferrer"><code>java.lang.System#getSecurityManager()</code></a></li>
</ul>

<hr>

<h2><a href="http://en.wikipedia.org/wiki/Structural_pattern" rel="nofollow noreferrer">Structural patterns</a></h2>

<h3><a href="http://en.wikipedia.org/wiki/Adapter_pattern" rel="nofollow noreferrer">Adapter</a> <sup><sub>(recognizeable by creational methods taking an instance of <em>different</em> abstract/interface type and returning an implementation of own/another abstract/interface type which <em>decorates/overrides</em> the given instance)</sub></sup></h3>

<ul>
<li><a href="http://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html#asList-T...-" rel="nofollow noreferrer"><code>java.util.Arrays#asList()</code></a></li>
<li><a href="https://docs.oracle.com/javase/8/docs/api/java/util/Collections.html#list-java.util.Enumeration-" rel="nofollow noreferrer"><code>java.util.Collections#list()</code></a></li>
<li><a href="https://docs.oracle.com/javase/8/docs/api/java/util/Collections.html#enumeration-java.util.Collection-" rel="nofollow noreferrer"><code>java.util.Collections#enumeration()</code></a></li>
<li><a href="http://docs.oracle.com/javase/8/docs/api/java/io/InputStreamReader.html#InputStreamReader-java.io.InputStream-" rel="nofollow noreferrer"><code>java.io.InputStreamReader(InputStream)</code></a> (returns a <code>Reader</code>)</li>
<li><a href="http://docs.oracle.com/javase/8/docs/api/java/io/OutputStreamWriter.html#OutputStreamWriter-java.io.OutputStream-" rel="nofollow noreferrer"><code>java.io.OutputStreamWriter(OutputStream)</code></a> (returns a <code>Writer</code>)</li>
<li><a href="http://docs.oracle.com/javase/8/docs/api/javax/xml/bind/annotation/adapters/XmlAdapter.html#marshal-BoundType-" rel="nofollow noreferrer"><code>javax.xml.bind.annotation.adapters.XmlAdapter#marshal()</code></a> and <a href="http://docs.oracle.com/javase/8/docs/api/javax/xml/bind/annotation/adapters/XmlAdapter.html#unmarshal-ValueType-" rel="nofollow noreferrer"><code>#unmarshal()</code></a></li>
</ul>

<h3><a href="http://en.wikipedia.org/wiki/Bridge_pattern" rel="nofollow noreferrer">Bridge</a> <sup><sub>(recognizeable by creational methods taking an instance of <em>different</em> abstract/interface type and returning an implementation of own abstract/interface type which <em>delegates/uses</em> the given instance)</sub></sup></h3>

<ul>
<li>None comes to mind yet. A fictive example would be <code>new LinkedHashMap(LinkedHashSet&lt;K&gt;, List&lt;V&gt;)</code> which returns an unmodifiable linked map which doesn't clone the items, but <em>uses</em> them. The <a href="http://docs.oracle.com/javase/8/docs/api/java/util/Collections.html#newSetFromMap-java.util.Map-" rel="nofollow noreferrer"><code>java.util.Collections#newSetFromMap()</code></a> and <a href="http://docs.oracle.com/javase/8/docs/api/java/util/Collections.html#singleton-T-" rel="nofollow noreferrer"><code>singletonXXX()</code></a> methods however comes close.</li>
</ul>

<h3><a href="http://en.wikipedia.org/wiki/Composite_pattern" rel="nofollow noreferrer">Composite</a> <sup><sub>(recognizeable by behavioral methods taking an instance of <em>same</em> abstract/interface type into a tree structure)</sub></sup></h3>

<ul>
<li><a href="http://docs.oracle.com/javase/8/docs/api/java/awt/Container.html#add-java.awt.Component-" rel="nofollow noreferrer"><code>java.awt.Container#add(Component)</code></a> (practically all over Swing thus)</li>
<li><a href="http://docs.oracle.com/javaee/7/api/javax/faces/component/UIComponent.html#getChildren--" rel="nofollow noreferrer"><code>javax.faces.component.UIComponent#getChildren()</code></a> (practically all over JSF UI thus)</li>
</ul>

<h3><a href="http://en.wikipedia.org/wiki/Decorator_pattern" rel="nofollow noreferrer">Decorator</a> <sup><sub>(recognizeable by creational methods taking an instance of <em>same</em> abstract/interface type which adds additional behaviour)</sub></sup></h3>

<ul>
<li>All subclasses of <a href="http://docs.oracle.com/javase/8/docs/api/java/io/InputStream.html" rel="nofollow noreferrer"><code>java.io.InputStream</code></a>, <a href="http://docs.oracle.com/javase/8/docs/api/java/io/OutputStream.html" rel="nofollow noreferrer"><code>OutputStream</code></a>, <a href="http://docs.oracle.com/javase/8/docs/api/java/io/Reader.html" rel="nofollow noreferrer"><code>Reader</code></a> and <a href="http://docs.oracle.com/javase/8/docs/api/java/io/Writer.html" rel="nofollow noreferrer"><code>Writer</code></a> have a constructor taking an instance of same type.</li>
<li><a href="http://docs.oracle.com/javase/8/docs/api/java/util/Collections.html" rel="nofollow noreferrer"><code>java.util.Collections</code></a>, the <a href="http://docs.oracle.com/javase/8/docs/api/java/util/Collections.html#checkedCollection-java.util.Collection-java.lang.Class-" rel="nofollow noreferrer"><code>checkedXXX()</code></a>, <a href="http://docs.oracle.com/javase/8/docs/api/java/util/Collections.html#synchronizedCollection-java.util.Collection-" rel="nofollow noreferrer"><code>synchronizedXXX()</code></a> and <a href="http://docs.oracle.com/javase/8/docs/api/java/util/Collections.html#unmodifiableCollection-java.util.Collection-" rel="nofollow noreferrer"><code>unmodifiableXXX()</code></a> methods.</li>
<li><a href="http://docs.oracle.com/javaee/7/api/javax/servlet/http/HttpServletRequestWrapper.html" rel="nofollow noreferrer"><code>javax.servlet.http.HttpServletRequestWrapper</code></a> and <a href="http://docs.oracle.com/javaee/7/api/javax/servlet/http/HttpServletResponseWrapper.html" rel="nofollow noreferrer"><code>HttpServletResponseWrapper</code></a></li>
<li><a href="https://docs.oracle.com/javase/7/docs/api/javax/swing/JScrollPane.html" rel="nofollow noreferrer"><code>javax.swing.JScrollPane</code></a></li>
</ul>

<h3><a href="http://en.wikipedia.org/wiki/Facade_pattern" rel="nofollow noreferrer">Facade</a> <sup><sub>(recognizeable by behavioral methods which internally uses instances of <em>different</em> independent abstract/interface types)</sub></sup></h3>

<ul>
<li><a href="http://docs.oracle.com/javaee/7/api/javax/faces/context/FacesContext.html" rel="nofollow noreferrer"><code>javax.faces.context.FacesContext</code></a>, it internally uses among others the abstract/interface types <a href="http://docs.oracle.com/javaee/7/api/javax/faces/lifecycle/Lifecycle.html" rel="nofollow noreferrer"><code>LifeCycle</code></a>, <a href="http://docs.oracle.com/javaee/7/api/javax/faces/application/ViewHandler.html" rel="nofollow noreferrer"><code>ViewHandler</code></a>, <a href="http://docs.oracle.com/javaee/7/api/javax/faces/application/NavigationHandler.html" rel="nofollow noreferrer"><code>NavigationHandler</code></a> and many more without that the enduser has to worry about it (which are however overrideable by injection).</li>
<li><a href="http://docs.oracle.com/javaee/7/api/javax/faces/context/ExternalContext.html" rel="nofollow noreferrer"><code>javax.faces.context.ExternalContext</code></a>, which internally uses <a href="http://docs.oracle.com/javaee/7/api/javax/servlet/ServletContext.html" rel="nofollow noreferrer"><code>ServletContext</code></a>, <a href="http://docs.oracle.com/javaee/7/api/javax/servlet/http/HttpSession.html" rel="nofollow noreferrer"><code>HttpSession</code></a>, <a href="http://docs.oracle.com/javaee/7/api/javax/servlet/http/HttpServletRequest.html" rel="nofollow noreferrer"><code>HttpServletRequest</code></a>, <a href="http://docs.oracle.com/javaee/7/api/javax/servlet/http/HttpServletResponse.html" rel="nofollow noreferrer"><code>HttpServletResponse</code></a>, etc.</li>
</ul>

<h3><a href="http://en.wikipedia.org/wiki/Flyweight_pattern" rel="nofollow noreferrer">Flyweight</a> <sup><sub>(recognizeable by creational methods returning a cached instance, a bit the "multiton" idea)</sub></sup></h3>

<ul>
<li><a href="http://docs.oracle.com/javase/8/docs/api/java/lang/Integer.html#valueOf-int-" rel="nofollow noreferrer"><code>java.lang.Integer#valueOf(int)</code></a> (also on <a href="http://docs.oracle.com/javase/8/docs/api/java/lang/Boolean.html#valueOf-boolean-" rel="nofollow noreferrer"><code>Boolean</code></a>, <a href="http://docs.oracle.com/javase/8/docs/api/java/lang/Byte.html#valueOf-byte-" rel="nofollow noreferrer"><code>Byte</code></a>, <a href="http://docs.oracle.com/javase/8/docs/api/java/lang/Character.html#valueOf-char-" rel="nofollow noreferrer"><code>Character</code></a>, <a href="http://docs.oracle.com/javase/8/docs/api/java/lang/Short.html#valueOf-short-" rel="nofollow noreferrer"><code>Short</code></a>, <a href="http://docs.oracle.com/javase/8/docs/api/java/lang/Long.html#valueOf-long-" rel="nofollow noreferrer"><code>Long</code></a> and <a href="https://docs.oracle.com/javase/8/docs/api/java/math/BigDecimal.html#valueOf-long-int-" rel="nofollow noreferrer"><code>BigDecimal</code></a>)</li>
</ul>

<h3><a href="http://en.wikipedia.org/wiki/Proxy_pattern" rel="nofollow noreferrer">Proxy</a> <sup><sub>(recognizeable by creational methods which returns an implementation of given abstract/interface type which in turn <em>delegates/uses</em> a <em>different</em> implementation of given abstract/interface type)</sub></sup></h3>

<ul>
<li><a href="http://docs.oracle.com/javase/8/docs/api/java/lang/reflect/Proxy.html" rel="nofollow noreferrer"><code>java.lang.reflect.Proxy</code></a></li>
<li><a href="http://docs.oracle.com/javase/8/docs/api/java/rmi/package-summary.html" rel="nofollow noreferrer"><code>java.rmi.*</code></a></li>
<li><a href="http://docs.oracle.com/javaee/7/api/javax/ejb/EJB.html" rel="nofollow noreferrer"><code>javax.ejb.EJB</code></a> (<a href="https://stackoverflow.com/questions/25514361/when-using-ejb-does-each-managed-bean-get-its-own-ejb-instance">explanation here</a>)</li>
<li><a href="http://docs.oracle.com/javaee/7/api/javax/inject/Inject.html" rel="nofollow noreferrer"><code>javax.inject.Inject</code></a> (<a href="https://stackoverflow.com/questions/29651008/field-getobj-returns-all-nulls-on-injected-cdi-managed-beans-while-manually-i/29672591#29672591">explanation here</a>)</li>
<li><a href="http://docs.oracle.com/javaee/7/api/javax/persistence/PersistenceContext.html" rel="nofollow noreferrer"><code>javax.persistence.PersistenceContext</code></a></li>
</ul>

<hr>

<h2><a href="http://en.wikipedia.org/wiki/Behavioral_pattern" rel="nofollow noreferrer">Behavioral patterns</a></h2>

<h3><a href="http://en.wikipedia.org/wiki/Chain_of_responsibility_pattern" rel="nofollow noreferrer">Chain of responsibility</a> <sup><sub>(recognizeable by behavioral methods which (indirectly) invokes the same method in <em>another</em> implementation of <em>same</em> abstract/interface type in a queue)</sub></sup></h3>

<ul>
<li><a href="http://docs.oracle.com/javase/8/docs/api/java/util/logging/Logger.html#log-java.util.logging.Level-java.lang.String-" rel="nofollow noreferrer"><code>java.util.logging.Logger#log()</code></a></li>
<li><a href="http://docs.oracle.com/javaee/7/api/javax/servlet/Filter.html#doFilter-javax.servlet.ServletRequest-javax.servlet.ServletResponse-javax.servlet.FilterChain-" rel="nofollow noreferrer"><code>javax.servlet.Filter#doFilter()</code></a></li>
</ul>

<h3><a href="http://en.wikipedia.org/wiki/Command_pattern" rel="nofollow noreferrer">Command</a> <sup><sub>(recognizeable by behavioral methods in an abstract/interface type which invokes a method in an implementation of a <em>different</em> abstract/interface type which has been <em>encapsulated</em> by the command implementation during its creation)</sub></sup></h3>

<ul>
<li>All implementations of <a href="http://docs.oracle.com/javase/8/docs/api/java/lang/Runnable.html" rel="nofollow noreferrer"><code>java.lang.Runnable</code></a></li>
<li>All implementations of <a href="http://docs.oracle.com/javase/8/docs/api/javax/swing/Action.html" rel="nofollow noreferrer"><code>javax.swing.Action</code></a></li>
</ul>

<h3><a href="http://en.wikipedia.org/wiki/Interpreter_pattern" rel="nofollow noreferrer">Interpreter</a> <sup><sub>(recognizeable by behavioral methods returning a <em>structurally</em> different instance/type of the given instance/type; note that parsing/formatting is not part of the pattern, determining the pattern and how to apply it is)</sub></sup></h3>

<ul>
<li><a href="http://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html" rel="nofollow noreferrer"><code>java.util.Pattern</code></a></li>
<li><a href="http://docs.oracle.com/javase/8/docs/api/java/text/Normalizer.html" rel="nofollow noreferrer"><code>java.text.Normalizer</code></a></li>
<li>All subclasses of <a href="http://docs.oracle.com/javase/8/docs/api/java/text/Format.html" rel="nofollow noreferrer"><code>java.text.Format</code></a></li>
<li>All subclasses of <a href="http://docs.oracle.com/javaee/7/api/javax/el/ELResolver.html" rel="nofollow noreferrer"><code>javax.el.ELResolver</code></a></li>
</ul>

<h3><a href="http://en.wikipedia.org/wiki/Iterator_pattern" rel="nofollow noreferrer">Iterator</a> <sup><sub>(recognizeable by behavioral methods sequentially returning instances of a <em>different</em> type from a queue)</sub></sup></h3>

<ul>
<li>All implementations of <a href="http://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html" rel="nofollow noreferrer"><code>java.util.Iterator</code></a> (thus among others also <a href="http://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html" rel="nofollow noreferrer"><code>java.util.Scanner</code></a>!).</li>
<li>All implementations of <a href="http://docs.oracle.com/javase/8/docs/api/java/util/Enumeration.html" rel="nofollow noreferrer"><code>java.util.Enumeration</code></a></li>
</ul>

<h3><a href="http://en.wikipedia.org/wiki/Mediator_pattern" rel="nofollow noreferrer">Mediator</a> <sup><sub>(recognizeable by behavioral methods taking an instance of different abstract/interface type (usually using the command pattern) which delegates/uses the given instance)</sub></sup></h3>

<ul>
<li><a href="http://docs.oracle.com/javase/8/docs/api/java/util/Timer.html" rel="nofollow noreferrer"><code>java.util.Timer</code></a> (all <code>scheduleXXX()</code> methods)</li>
<li><a href="http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/Executor.html#execute-java.lang.Runnable-" rel="nofollow noreferrer"><code>java.util.concurrent.Executor#execute()</code></a></li>
<li><a href="http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/ExecutorService.html" rel="nofollow noreferrer"><code>java.util.concurrent.ExecutorService</code></a> (the <code>invokeXXX()</code> and <code>submit()</code> methods)</li>
<li><a href="http://docs.oracle.com/javase/8/docs/api/java/util/concurrent/ScheduledExecutorService.html" rel="nofollow noreferrer"><code>java.util.concurrent.ScheduledExecutorService</code></a> (all <code>scheduleXXX()</code> methods)</li>
<li><a href="http://docs.oracle.com/javase/8/docs/api/java/lang/reflect/Method.html#invoke-java.lang.Object-java.lang.Object...-" rel="nofollow noreferrer"><code>java.lang.reflect.Method#invoke()</code></a></li>
</ul>

<h3><a href="http://en.wikipedia.org/wiki/Memento_pattern" rel="nofollow noreferrer">Memento</a> <sup><sub>(recognizeable by behavioral methods which internally changes the state of the <em>whole</em> instance)</sub></sup></h3>

<ul>
<li><a href="http://docs.oracle.com/javase/8/docs/api/java/util/Date.html" rel="nofollow noreferrer"><code>java.util.Date</code></a> (the setter methods do that, <code>Date</code> is internally represented by a <code>long</code> value)</li>
<li>All implementations of <a href="http://docs.oracle.com/javase/8/docs/api/java/io/Serializable.html" rel="nofollow noreferrer"><code>java.io.Serializable</code></a></li>
<li>All implementations of <a href="http://docs.oracle.com/javaee/7/api/javax/faces/component/StateHolder.html" rel="nofollow noreferrer"><code>javax.faces.component.StateHolder</code></a></li>
</ul>

<h3><a href="http://en.wikipedia.org/wiki/Observer_pattern" rel="nofollow noreferrer">Observer (or Publish/Subscribe)</a> <sup><sub>(recognizeable by behavioral methods which invokes a method on an instance of <em>another</em> abstract/interface type, depending on own state)</sub></sup></h3>

<ul>
<li><a href="http://docs.oracle.com/javase/8/docs/api/java/util/Observer.html" rel="nofollow noreferrer"><code>java.util.Observer</code></a>/<a href="http://docs.oracle.com/javase/8/docs/api/java/util/Observable.html" rel="nofollow noreferrer"><code>java.util.Observable</code></a> (rarely used in real world though)</li>
<li>All implementations of <a href="http://docs.oracle.com/javase/8/docs/api/java/util/EventListener.html" rel="nofollow noreferrer"><code>java.util.EventListener</code></a> (practically all over Swing thus)</li>
<li><a href="http://docs.oracle.com/javaee/7/api/javax/servlet/http/HttpSessionBindingListener.html" rel="nofollow noreferrer"><code>javax.servlet.http.HttpSessionBindingListener</code></a></li>
<li><a href="http://docs.oracle.com/javaee/7/api/javax/servlet/http/HttpSessionAttributeListener.html" rel="nofollow noreferrer"><code>javax.servlet.http.HttpSessionAttributeListener</code></a></li>
<li><a href="http://docs.oracle.com/javaee/7/api/javax/faces/event/PhaseListener.html" rel="nofollow noreferrer"><code>javax.faces.event.PhaseListener</code></a></li>
</ul>

<h3><a href="http://en.wikipedia.org/wiki/State_pattern" rel="nofollow noreferrer">State</a> <sup><sub>(recognizeable by behavioral methods which changes its behaviour depending on the instance's state which can be controlled externally)</sub></sup></h3>

<ul>
<li><a href="http://docs.oracle.com/javaee/7/api/javax/faces/lifecycle/Lifecycle.html#execute-javax.faces.context.FacesContext-" rel="nofollow noreferrer"><code>javax.faces.lifecycle.LifeCycle#execute()</code></a> (controlled by <a href="http://docs.oracle.com/javaee/7/api/javax/faces/webapp/FacesServlet.html" rel="nofollow noreferrer"><code>FacesServlet</code></a>, the behaviour is dependent on current phase (state) of JSF lifecycle)</li>
</ul>

<h3><a href="http://en.wikipedia.org/wiki/Strategy_pattern" rel="nofollow noreferrer">Strategy</a> <sup><sub>(recognizeable by behavioral methods in an abstract/interface type which invokes a method in an implementation of a <em>different</em> abstract/interface type which has been <em>passed-in</em> as method argument into the strategy implementation)</sub></sup></h3>

<ul>
<li><a href="http://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html#compare-T-T-" rel="nofollow noreferrer"><code>java.util.Comparator#compare()</code></a>, executed by among others <code>Collections#sort()</code>.</li>
<li><a href="http://docs.oracle.com/javaee/7/api/javax/servlet/http/HttpServlet.html" rel="nofollow noreferrer"><code>javax.servlet.http.HttpServlet</code></a>, the <code>service()</code> and all <code>doXXX()</code> methods take <code>HttpServletRequest</code> and <code>HttpServletResponse</code> and the implementor has to process them (and not to get hold of them as instance variables!).</li>
<li><a href="http://docs.oracle.com/javaee/7/api/javax/servlet/Filter.html#doFilter-javax.servlet.ServletRequest-javax.servlet.ServletResponse-javax.servlet.FilterChain-" rel="nofollow noreferrer"><code>javax.servlet.Filter#doFilter()</code></a></li>
</ul>

<h3><a href="http://en.wikipedia.org/wiki/Template_method_pattern" rel="nofollow noreferrer">Template method</a> <sup><sub>(recognizeable by behavioral methods which already have a "default" behaviour definied by an abstract type)</sub></sup></h3>

<ul>
<li>All non-abstract methods of <a href="http://docs.oracle.com/javase/8/docs/api/java/io/InputStream.html" rel="nofollow noreferrer"><code>java.io.InputStream</code></a>, <a href="http://docs.oracle.com/javase/8/docs/api/java/io/OutputStream.html" rel="nofollow noreferrer"><code>java.io.OutputStream</code></a>, <a href="http://docs.oracle.com/javase/8/docs/api/java/io/Reader.html" rel="nofollow noreferrer"><code>java.io.Reader</code></a> and <a href="http://docs.oracle.com/javase/8/docs/api/java/io/Writer.html" rel="nofollow noreferrer"><code>java.io.Writer</code></a>.</li>
<li>All non-abstract methods of <a href="http://docs.oracle.com/javase/8/docs/api/java/util/AbstractList.html" rel="nofollow noreferrer"><code>java.util.AbstractList</code></a>, <a href="http://docs.oracle.com/javase/8/docs/api/java/util/AbstractSet.html" rel="nofollow noreferrer"><code>java.util.AbstractSet</code></a> and <a href="http://docs.oracle.com/javase/8/docs/api/java/util/AbstractMap.html" rel="nofollow noreferrer"><code>java.util.AbstractMap</code></a>.</li>
<li><a href="http://docs.oracle.com/javaee/7/api/javax/servlet/http/HttpServlet.html" rel="nofollow noreferrer"><code>javax.servlet.http.HttpServlet</code></a>, all the <code>doXXX()</code> methods by default sends a HTTP 405 "Method Not Allowed" error to the response. You're free to implement none or any of them.</li>
</ul>

<h3><a href="http://en.wikipedia.org/wiki/Visitor_pattern" rel="nofollow noreferrer">Visitor</a> <sup><sub>(recognizeable by two <em>different</em> abstract/interface types which has methods definied which takes each the <em>other</em> abstract/interface type; the one actually calls the method of the other and the other executes the desired strategy on it)</sub></sup></h3>

<ul>
<li><a href="http://docs.oracle.com/javase/8/docs/api/javax/lang/model/element/AnnotationValue.html" rel="nofollow noreferrer"><code>javax.lang.model.element.AnnotationValue</code></a> and <a href="http://docs.oracle.com/javase/8/docs/api/javax/lang/model/element/AnnotationValueVisitor.html" rel="nofollow noreferrer"><code>AnnotationValueVisitor</code></a></li>
<li><a href="http://docs.oracle.com/javase/8/docs/api/javax/lang/model/element/Element.html" rel="nofollow noreferrer"><code>javax.lang.model.element.Element</code></a> and <a href="http://docs.oracle.com/javase/8/docs/api/javax/lang/model/element/ElementVisitor.html" rel="nofollow noreferrer"><code>ElementVisitor</code></a></li>
<li><a href="http://docs.oracle.com/javase/8/docs/api/javax/lang/model/type/TypeMirror.html" rel="nofollow noreferrer"><code>javax.lang.model.type.TypeMirror</code></a> and <a href="http://docs.oracle.com/javase/8/docs/api/javax/lang/model/type/TypeVisitor.html" rel="nofollow noreferrer"><code>TypeVisitor</code></a></li>
<li><a href="http://docs.oracle.com/javase/8/docs/api/java/nio/file/FileVisitor.html" rel="nofollow noreferrer"><code>java.nio.file.FileVisitor</code></a> and <a href="http://docs.oracle.com/javase/8/docs/api/java/nio/file/SimpleFileVisitor.html" rel="nofollow noreferrer"><code>SimpleFileVisitor</code></a></li>
<li><a href="http://docs.oracle.com/javaee/7/api/javax/faces/component/visit/VisitContext.html" rel="nofollow noreferrer"><code>javax.faces.component.visit.VisitContext</code></a> and <a href="http://docs.oracle.com/javaee/7/api/javax/faces/component/visit/VisitCallback.html" rel="nofollow noreferrer"><code>VisitCallback</code></a></li>
</ul>