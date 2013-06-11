package com.example.test;

import android.content.Context;
import android.util.Log;
import android.util.Xml;

import org.xmlpull.v1.XmlSerializer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.StringWriter;
import java.util.HashMap;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.XStreamException;
import com.thoughtworks.xstream.io.xml.StaxDriver;
//import com.thoughtworks.xstream.io.xml.StaxDriver;

/**
 * Created by sylphs on 13/06/11.
 */
public class XMLParser {

    private String XML_FILE_NAME="test.xml";

    private XStream mXStream;

    public XMLParser()
    {
       //mXStream = new XStream( new StaxDriver());
       mXStream = new XStream();
       
//        try {
//         XStream xstream = new XStream();
//        }catch(XStreamException e) {
 //          Log.d("test", e.getMessage());
 //       }
    }

//    public String writeXML( HashMap<String , String> aXmlInnerValue )
    public String writeXML()
    {
        XmlSerializer serializer = Xml.newSerializer();
        StringWriter writer = new StringWriter();
        try {
            serializer.setOutput(writer);
            serializer.startDocument("UTF-8", true);
            serializer.startTag("", "messages");
            serializer.endTag("", "messages");
            serializer.endDocument();
            return writer.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    public void setAlias( String aKey , Class<?> aClass )
    {
        mXStream.alias(aKey , aClass );
    }

    public void setAlias( HashMap<String,Class<?>> aAliasMap )
    {
       // Nothing...
    }

    public String toXML( Object aClass )
    {
        if( null == mXStream ) {
            return "";
        }

        return mXStream.toXML( aClass );
//        return "";
    }

    public Object fromXML( String aXmlString ) {
//        if( aXmlString.isEmpty() ) {
//            return null;
//        }
//        return mXStream.fromXML( aXmlString );
        return null;
    }

    // Debug
    public boolean saveXML( Context aContext , String aPath , String aXmlDom )
    {
        File file = new File(aPath);
        if( file.exists() ) {
            file.delete();
        }
        try {
            FileOutputStream outputStream   = aContext.openFileOutput( XML_FILE_NAME , aContext.MODE_PRIVATE );
            outputStream.write( aXmlDom.toString().getBytes() );
        } catch ( FileNotFoundException e ) {
            e.printStackTrace();
        } catch ( Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    public String loadXML( String aPath )
    {
        File file = new File(aPath);
        if( !file.exists() ) {
           return "";
        }
        return "";
    }

    public HashMap<String, Object > parse( String aDomString  )
    {
        HashMap<String, Object> parseMap = null;

        return parseMap;
    }

    private void deserialize(  String aValueType ,  Object aData )
    {

    }

    private enum ValueTypeEnum {
        VALUE_TYPE_STRING,
        VALUE_TYPE_INT,
        VALUE_TYPE_BOOLEAN
    };
}

