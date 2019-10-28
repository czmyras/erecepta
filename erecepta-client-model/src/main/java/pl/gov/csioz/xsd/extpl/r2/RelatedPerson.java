//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.10.03 at 11:02:58 PM CEST 
//


package pl.gov.csioz.xsd.extpl.r2;

import org.hl7.v3.EN;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelatedPerson complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="RelatedPerson"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.csioz.gov.pl/xsd/extPL/r2}InfrastructureRoot"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{urn:hl7-org:v3}EN"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="classCode" use="required" type="{urn:hl7-org:v3}EntityClassLivingSubject" fixed="PSN" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelatedPerson", propOrder = {
        "name"
})
public class RelatedPerson
        extends InfrastructureRoot {

    @XmlElement(required = true)
    protected EN name;
    @XmlAttribute(name = "classCode", required = true)
    protected String classCode;

    /**
     * Gets the value of the name property.
     *
     * @return possible object is
     * {@link EN }
     */
    public EN getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value allowed object is
     *              {@link EN }
     */
    public void setName(EN value) {
        this.name = value;
    }

    /**
     * Gets the value of the classCode property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getClassCode() {
        if (classCode == null) {
            return "PSN";
        } else {
            return classCode;
        }
    }

    /**
     * Sets the value of the classCode property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setClassCode(String value) {
        this.classCode = value;
    }

}