package devsbox.discount_on.Adaptor;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import devsbox.discount_on.R;

/**
 * Created by Jihan on 10-Aug-17.
 */

public class CustomAdapterLeft extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] header;
    private final String[] address;
    private final String[] percent;

    private final Integer[] imageId;

    public CustomAdapterLeft(Activity context, String[] header, String[] address, Integer[] imageId ,String[] percent) {

        super(context, R.layout.home_left_listview, header);


        this.context = context;

        this.header = header;
        this.address = address;
        this.percent = percent;
        this.imageId = imageId;

    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {

        LayoutInflater inflater = context.getLayoutInflater();

        View rowView= inflater.inflate(R.layout.home_left_listview, null, true);

        TextView txtHeader = (TextView) rowView.findViewById(R.id.HomeLeftHeaderListTextView);
        TextView txtAddress = (TextView) rowView.findViewById(R.id.HomeLeftAddressListTextView);
        TextView txtPercent = (TextView) rowView.findViewById(R.id.HomeLeftPercentListTextView);

        ImageView imageView = (ImageView) rowView.findViewById(R.id.HomeLeftImageListImageView);

        txtHeader.setText(header[position]);
        txtAddress.setText(address[position]);
        txtPercent.setText(percent[position]);
        imageView.setImageResource(imageId[position]);

        return rowView;
    }
}