import busstop.BusStopItem;
import route.RouteItem;

import java.util.ArrayList;

/**
 * Created by BHI on 2016-05-15.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<BusStopItem> mBusStopItemList = new ArrayList<BusStopItem>();
        ArrayList<RouteItem> mRouteItemList = new ArrayList<RouteItem>();

        for( BusStopItem mBusStopItem : Parser.getBusStopListByWord(mBusStopItemList, "경북대") ) {
            System.out.println(mBusStopItem.getBsNm() + mBusStopItem.getUrl());
        }

        for( RouteItem mRouteItem : Parser.getRouteListByNo(mRouteItemList, "순환") ) {
            System.out.println(mRouteItem.getUrl());
            System.out.println(Parser.getRouteByUrl(mRouteItem.getUrl()));
        }

    }
}
