package com.jayce.log.type;

import android.util.Log;

import com.jayce.log.JLog;
import com.jayce.log.JLogUtil;

import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

/**
 * Create by jayce.dong on 2022/7/14
 */
public class XmlLog {
    public static void printXml(String tag, String xml, String headString) {

        if (xml != null) {
            xml = XmlLog.formatXML(xml);
            xml = headString + "\n" + xml;
        } else {
            xml = headString + JLog.NULL_TIPS;
        }

        JLogUtil.printLine(tag, true);
        String[] lines = xml.split(JLog.LINE_SEPARATOR);
        for (String line : lines) {
            if (!JLogUtil.isEmpty(line)) {
                Log.d(tag, "║ " + line);
            }
        }
        JLogUtil.printLine(tag, false);
    }

    private static String formatXML(String inputXML) {
        try {
            Source xmlInput = new StreamSource(new StringReader(inputXML));
            StreamResult xmlOutput = new StreamResult(new StringWriter());
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
            transformer.transform(xmlInput, xmlOutput);
            return xmlOutput.getWriter().toString().replaceFirst(">", ">\n");
        } catch (Exception e) {
            e.printStackTrace();
            return inputXML;
        }
    }
}
