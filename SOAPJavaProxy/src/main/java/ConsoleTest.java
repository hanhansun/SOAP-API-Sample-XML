


/// For AO11 services:
//import com.esri.mapservice.*;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class ConsoleTest {

    public static void main(String[] args) throws Exception {

/*
        String serviceEndpoint = "https://<machine>.esri.com/server/services/SampleWorldCities/MapServer";

        String namespaceUrl = "http://www.esri.com/schemas/ArcGIS/2.6.0";
        //For Pro-based services, the namespaceUrl should be http://www.esri.com/schemas/ArcGIS/2.6.0
        //For ArcMap-based services, the namespaceUrl should be http://www.esri.com/schemas/ArcGIS/10.8

        String localParts = "SampleWorldCities_MapServer";
        //The localParts is in the format of "ServiceName_ServiceType"
        //For services set to use shared instances, the localParts should be "DynamicMappingHost_MapServer"

        QName qname = new QName(namespaceUrl, localParts);
        URL url = new URL(serviceEndpoint);
        Service service = Service.create(url, qname);
        MapServerPort test = service.getPort( MapServerPort.class);
        String mapName = test.getDefaultMapName();
        System.out.println(mapName);
        MapServerInfo servInfo = test.getServerInfo(mapName);
        ImageDescription imageDescription = new ImageDescription();
        ImageDisplay mapdisp= new ImageDisplay();
        mapdisp.setImageDPI(96);
        mapdisp.setImageHeight(500);
        mapdisp.setImageWidth(500);
        imageDescription.setImageDisplay(mapdisp);
        ImageType imagetp= new ImageType();
        imagetp.setImageFormat(EsriImageFormat.ESRI_IMAGE_JPG);
        imagetp.setImageReturnType(EsriImageReturnType.ESRI_IMAGE_RETURN_URL);

        imageDescription.setImageType(imagetp);
        MapImage exportImage = test.exportMapImage(servInfo.getDefaultMapDescription(), imageDescription);
        String outImageUrl = exportImage.getImageURL();
        System.out.println(outImageUrl);
*/

    }
}
