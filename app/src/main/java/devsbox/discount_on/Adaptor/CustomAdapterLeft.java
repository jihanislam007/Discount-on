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
    private final String[] header_left;
    private final String[] address_left;
    private final String[] percent_left;

    private final Integer[] imageId_left;

    public CustomAdapterLeft(Activity context, String[] header_left, String[] address_left, Integer[] imageId_left ,String[] percent_left) {

        super(context, R.layout.home_left_listview, header_left);


        this.context = context;

        this.header_left = header_left;
        this.address_left = address_left;
        this.percent_left = percent_left;
        this.imageId_left = imageId_left;

    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {

        LayoutInflater inflater = context.getLayoutInflater();

        View rowView= inflater.inflate(R.layout.home_left_listview, null, true);

        TextView txtHeader = (TextView) rowView.findViewById(R.id.HomeLeftHeaderListTextView);
        TextView txtAddress = (TextView) rowView.findViewById(R.id.HomeLeftAddressListTextView);
        TextView txtPercent = (TextView) rowView.findViewById(R.id.HomeLeftPercentListTextView);

        ImageView imageView = (ImageView) rowView.findViewById(R.id.HomeLeftImageListImageView);

        txtHeader.setText(header_left[position]);
        txtAddress.setText(address_left[position]);
        txtPercent.setText(percent_left[position]);
        imageView.setImageResource(imageId_left[position]);

        return rowView;
    }
}